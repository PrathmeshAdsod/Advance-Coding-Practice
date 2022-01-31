
// Recursive Solution

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

    static Set<String> dictionary = new HashSet<>();

    // Using Recursion
   static boolean breakWord(String word){

        int size = word.length();  // changing size for new word

        // Base condition
        if(size == 0) return true;

        for(int i = 1; i <= size; i++){

              if(dictionary.contains(word.substring(0,i)) && breakWord(word.substring(i,size))){
                // This are the words we found and return 
                System.out.println(word.substring(0,i));
                return true;
              }
              
        }

        return false;
    }


    
   /* // Using DP
    static boolean wordBreak(String word) {
        
    }*/


    public static void main(String[] args) {

        String my_dictionary[] = { 
                   "mobile", "samsung", "sam", "sung",
                   "man", "mango", "icecream", "and",
                   "go", "i", "like", "ice", "cream","ab" 
                };


                for(String temp : my_dictionary){
                      dictionary.add(temp);
                }

                String word = "abicelikesamsung";

                System.out.println(breakWord(word));
               
    }
}
