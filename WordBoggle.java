
/*
I write this code on myself without any help using backtracking
Something is wrong going in code 
Just rectify it

Go on https://www.techiedelight.com/generate-list-of-possible-words-from-a-character-matrix/
Or Go on GeeksforGeeks for DFS Solution
*/

public class WordBoggle {

    static boolean isSafe(char boggle[][], String word, int i, int j, boolean visited[][] , String founded) {

        int n = boggle.length;
        int m = boggle[0].length;

        String a = word.substring(founded.length(),word.length());

        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || boggle[i][j] != a.charAt(0) ) {
            return false;
        }
        return true;
    }

    static void isWord(String word, char boggle[][], int i, int j, boolean visited[][], String founded) {

        if(founded.length() == word.length()){
            return;
        }
        if(founded.length() == 0) {
            findWord(word, boggle, boggle.length, boggle[0].length);
        }

        visited[i][j] = true;

        if (isSafe(boggle, word, i + 1, j, visited , founded)) {
       //     visited[i + 1][j] = true;
            founded += boggle[i + 1][j];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i + 1, j, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }
        if (isSafe(boggle, word, i - 1, j, visited , founded)) {
         //   visited[i -  1][j] = true;
            founded += boggle[i - 1][j];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i - 1, j, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }
        if (isSafe(boggle, word, i, j + 1, visited , founded)) {
        //    visited[i][j + 1] = true;
            founded += boggle[i][j + 1];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i, j + 1, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }
        if (isSafe(boggle, word, i, j - 1, visited , founded)) {
         //   visited[i][j - 1] = true;
            founded += boggle[i][j - 1];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i, j - 1, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }
        if (isSafe(boggle, word, i - 1, j - 1, visited , founded)) {
        //    visited[i - 1][j - 1] = true;
            founded += boggle[i - 1][j - 1];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i - 1, j - 1, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }
        if (isSafe(boggle, word, i + 1, j + 1, visited , founded)) {
         //   visited[i + 1][j + 1] = true;
            founded += boggle[i + 1][j + 1];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i + 1, j + 1, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }
        if (isSafe(boggle, word, i + 1, j - 1, visited , founded)) {
         //   visited[i + 1][j - 1] = true;
            founded += boggle[i + 1][j - 1];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i + 1, j - 1, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }
        if (isSafe(boggle, word, i - 1, j + 1, visited , founded)) {
         //   visited[i - 1][j + 1] = true;
            founded += boggle[i - 1][j + 1];
            System.out.println(founded); // just for tracking word
            isWord(word, boggle, i - 1, j + 1, visited, founded);
            founded = founded.substring(0, founded.length() - 1); // Backtrack
        }

        visited[i][j] = false;
        
    }

    static boolean findWord(String word, char boggle[][], int n, int m) {

        boolean visited[][] = new boolean[n][m];

        String founded = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (boggle[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    founded += word.charAt(0);
                    isWord(word, boggle, i, j, visited, founded);
                }
            }
        }
        System.out.println(founded.length());
        

      return  founded == word;
        

       
    }

    public static void main(String[] args) {
  //      String dictionary[] = { "Ram", "Lakshman", "Krishna", "Arjun" };
        String word = "Krisna";
        char boggle[][] = {
                { 'L', 'K', 'A', 'R' },
                { 'a', 'k', 'r', 'j' },
                { 's', 'h', 'i', 'u' },
                { 'n', 'a', 'n', 's' }
        };

        int n = boggle.length;
        int m = boggle[0].length;

        System.out.println(findWord(word, boggle, n, m));

    }
}
