
// Time Complexity for insert search startswith will be O(M)
// where M is number of character that we have inside word
// Space Complexity O(M) for Insert
// Space Complexity for Search and StartsWith is O(1)

class Trie {

    public Node root;

    /* Initialize Trie Data Structure */
    public Trie() {
         root = new Node('\0');   // \0 is representing to Empty character
    }

    /* Insert in Trie */
    public void insert(String word) {
        // curr will move in our trie data structure
        Node curr = root;

        for(int i = 0; i < word.length(); i++){
             // Extract character
             char c = word.charAt(i);

             /*
               We are doing c - 'a'  becoz 'a' have certain decimal value
               So whatever character we having we can always subtract by character 'a'
               and that will be index between 0 and 25
             */
             if(curr.children[c - 'a'] == null){
                 curr.children[c - 'a'] = new Node(c);               
              }
              // Moving down chain of Trie
              curr = curr.children[c - 'a'];
          }

          // Very last character of whatever word we are inserting we must mark it true
          curr.word_end = true;
    }      
      
    /* Return true/false */
    public boolean search(String word){
         Node node = getNode(word);

         return node != null && node.word_end;
    }
    /* is starts with */
    public boolean startsWith(String prefix){
       return getNode(prefix) != null;
    }

    /* Helper Function for search(String word) and startsWith(String prefix) */

    // getNode(String word) helper function will return very last node that we are looking for

    public Node getNode(String word){
        Node curr = root;
        for(int i =0; i < word.length(); i++){
            // Extract Character
            char c = word.charAt(i);
            // We check node of char c is created if not we return null
            if(curr.children[c-'a'] == null){
                return null;
            }

            curr = curr.children[c - 'a'];
        }
        return curr;
    }


    
    class Node {
        public static final int alphabates = 26 ;
        public char c;
        public boolean word_end;
        public Node[] children;  // We are making Node's children so we give Node[] children

        // Constructor
        public Node(char c){
            this.c = c;
            this.word_end = false;
            // Every single Node will point to 26 children node from below code line
            this.children = new Node[alphabates];
        }
    }
}

public class Trie2 extends Trie {

    public static void main(String[] args) {

        Trie2 key = new Trie2();
        String arr[] = {"ram","prathmesh","ramesh"};

        for(int i = 0; i < arr.length; i++){
            key.insert(arr[i]);
        }

        if(key.search("prat")){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }

        if(key.startsWith("abc")){
            System.out.println("it starts");
        }else{
            System.out.println("it dont't starts");
        }
    }
}
