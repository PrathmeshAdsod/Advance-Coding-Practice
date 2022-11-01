import java.util.*;
public class TravellingSalesmanRecursive {
   	
static int V = 4;
static int travllingSalesmanProblem(int graph[][],
									int s)
{
    ArrayList<Integer> vertex = new ArrayList<Integer>();

    for (int i = 0; i < V; i++)
	    if (i != s)
	        vertex.add(i);

    int min_path = Integer.MAX_VALUE;
    do
    {
	    int current_pathweight = 0;
	    int k = s;
	
    	for (int i = 0; i < vertex.size(); i++)
	    {
	        current_pathweight += graph[k][vertex.get(i)];
	        k = vertex.get(i);
	    }
	    current_pathweight += graph[k][s];
	    min_path = Math.min(min_path, current_pathweight);

    } while (findNextPermutation(vertex));

    return min_path;
}
public static ArrayList<Integer> swap(ArrayList<Integer> data,int left, int right){
    int temp = data.get(left);
    data.set(left, data.get(right));
    data.set(right, temp);
    return data;
}
public static ArrayList<Integer> reverse(ArrayList<Integer> data, int left, int right)
{
    while (left < right)
    {
	    int temp = data.get(left);
	    data.set(left++, data.get(right));
	    data.set(right--, temp);
    }
    return data;
}
public static boolean findNextPermutation(ArrayList<Integer> vertex)
{
    // This function will make arraylist permute

    if (vertex.size() <= 1)      // if size is 1 then we cant permute it;
	    return false;

    int size = vertex.size() - 2;
    while (size >= 0)   
    {
	    if (vertex.get(size) < vertex.get(size + 1))
	    {
	        break;
	    }
	    size--;
    }
    if (size < 0)
	    return false;

    int nextGreater = vertex.size() - 1;
    for (int i = vertex.size() - 1; i > size; i--) {
	    if (vertex.get(i) > vertex.get(size))
	    {
	        nextGreater = i;
	        break;
	    }
    }
    vertex = swap(vertex,nextGreater, size);
    vertex = reverse(vertex, size + 1, vertex.size() - 1);
    return true;
}
public static void main(String args[]){
    int graph[][] = {{0, 10, 15, 20},
	    			{10, 0, 35, 25},
		    		{15, 35, 0, 30},
		    		{20, 25, 30, 0}};
    int s = 0;
    System.out.println(travllingSalesmanProblem(graph, s));
    }

}
