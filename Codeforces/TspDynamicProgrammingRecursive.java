
/**
 * This file contains a recursive implementation of the TSP problem using dynamic programming. The
 * main idea is that since we need to do all n! permutations of nodes to find the optimal solution
 * that caching the results of sub paths can improve performance.
 *
 * For example, if one permutation is: '... D A B C' then later when we need to compute the value
 * of the permutation '... E B A C' we should already have cached the answer for the subgraph
 * containing the nodes {A, B, C}.
 *
 * Time Complexity: O(n^2 * 2^n) Space Complexity: O(n * 2^n)
 */

import java.util.*;

public class TspDynamicProgrammingRecursive {

  private final int N;
  private final int START_NODE;
  private final int FINISHED_STATE;

  private double[][] distance;
  private double minTourCost = Double.POSITIVE_INFINITY;

  private List<Integer> tour = new ArrayList<>();
  private boolean ranSolver = false;

  public TspDynamicProgrammingRecursive(double[][] distance) {
    this(0, distance);
  }

  public TspDynamicProgrammingRecursive(int startNode, double[][] distance) {

    this.distance = distance;
    N = distance.length;
    START_NODE = startNode;

    /*
     * The finished state is when the finished state mask has all bits are set to
     * one (meaning all the nodes have been visited).
     */
    FINISHED_STATE = (1 << N) - 1; // here finished state is if N is 4 -- (1 << 4) - 1 = 7
  }

  // Returns the optimal tour for the traveling salesman problem.
  public List<Integer> getTour() {
    if (!ranSolver)
      solve();
    return tour;
  }

  // Returns the minimal tour cost.
  public double getTourCost() {
    if (!ranSolver)
      solve();
    return minTourCost;
  }

  public void solve() {

    // Run the solver
    int state = 1 << START_NODE;
    Double[][] memo = new Double[N][1 << N];
    Integer[][] prev = new Integer[N][1 << N];
    minTourCost = tsp(START_NODE, state, memo, prev);

    // Regenerate path
    int index = START_NODE;
    while (true) {
      tour.add(index);
      Integer nextIndex = prev[index][state];
      if (nextIndex == null)
        break;
      int nextState = state | (1 << nextIndex);
      state = nextState;
      index = nextIndex;
    }
    tour.add(START_NODE);
    ranSolver = true;
  }

  private double tsp(int i, int state, Double[][] memo, Integer[][] prev) {

    // Done this tour. Return cost of going back to start node.
    if (state == FINISHED_STATE)
      return distance[i][START_NODE];

    // Return cached answer if already computed.
    if (memo[i][state] != null)
      return memo[i][state];

    double minCost = Double.POSITIVE_INFINITY;
    int index = -1;
    for (int next = 0; next < N; next++) {

      // Skip if the next node has already been visited.
      if ((state & (1 << next)) != 0)
        continue;

      int nextState = state | (1 << next);
      double newCost = distance[i][next] + tsp(next, nextState, memo, prev);
      if (newCost < minCost) {
        minCost = newCost;
        index = next;
      }
    }

    prev[i][state] = index;
    return memo[i][state] = minCost;
  }

  // Example usage:
  public static void main(String[] args) {

    // Create adjacency matrix
    int n = 4;
    double[][] distanceMatrix = new double[n][n];

    distanceMatrix[0][1] = 10;
    distanceMatrix[0][2] = 15;
    distanceMatrix[0][3] = 20;
    distanceMatrix[1][0] = 5;
    distanceMatrix[1][2] = 9;
    distanceMatrix[1][3] = 10;
    distanceMatrix[2][0] = 6;
    distanceMatrix[2][1] = 13;
    distanceMatrix[2][3] = 12;
    distanceMatrix[3][0] = 8;
    distanceMatrix[3][1] = 8;
    distanceMatrix[3][2] = 9;
    // Run the solver
    TspDynamicProgrammingRecursive solver = new TspDynamicProgrammingRecursive(distanceMatrix);

    System.out.println("Tour: " + solver.getTour());

    System.out.println("Tour cost: " + solver.getTourCost());
  }
}