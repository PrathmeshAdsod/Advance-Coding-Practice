import java.util.*;

public class Bishop {
    static int ptr1 = 0;
    static int ptr2 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int z = 1; z <= T; z++) {
            sc.nextLine();

            char grid[][] = new char[8][8];

            for (int i = 0; i < 8; i++) {
                String str = sc.nextLine();
                for (int j = 0; j < 8; j++) {
                    char ch = str.charAt(j);
                    grid[i][j] = ch;
                }
            }
            boolean visited[][] = new boolean[8][8];

            for (int j = 0; j < 8; j++) {
                if (grid[7][j] == '#') {
                    bishopGoTop(grid, 7, j, visited);
                }
            }
            for (int j = 0; j < 8; j++) {
                if (grid[0][j] == '#') {
                    bishopGoBottom(grid, 0, j, visited);
                }
            }
            ptr1 += 1;
            ptr2 += 1;
            System.out.println(ptr1 + " " + ptr2);
        }
    }

    private static void bishopGoTop(char[][] grid, int i, int j, boolean visited[][]) {
        for (int row = i, col = j; row >= 0 && col >= 0; row--, col--) {
            if (visited[row][col]) {
                ptr1 = row;
                ptr2 = col;
                return;
            } else if (grid[row][col] == '#') {
                visited[row][col] = true;
            }
        }
        for (int row = i, col = j; row < 8 && col < 8; row--, col++) {
            if (visited[row][col]) {
                ptr1 = row;
                ptr2 = col;
                return;
            } else if (grid[row][col] == '#') {
                visited[row][col] = true;
            }
        }
    }

    private static void bishopGoBottom(char[][] grid, int i, int j, boolean visited[][]) {
        for (int row = i, col = j; row < 8 && col >= 0; row++, col--) {
            if (visited[row][col]) {
                ptr1 = row;
                ptr2 = col;
                return;
            } else if (grid[row][col] == '#') {
                visited[row][col] = true;
            }
        }
        for (int row = i, col = j; row < 8 && col < 8; row++, col++) {
            if (visited[row][col]) {
                ptr1 = row;
                ptr2 = col;
                return;
            } else if (grid[row][col] == '#') {
                visited[row][col] = true;
            }
        }
    }
}
