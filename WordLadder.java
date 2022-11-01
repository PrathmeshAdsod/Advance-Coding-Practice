import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadder {

    static void matchWord(String str , HashMap<String,Boolean> map, Queue<String> queue){
           for(int i = 0; i < str.length();i++){
               char charact[] = str.toCharArray(); // Converting word in queue to char array

               for(int j = 0; j < 26; j++){
                   char c = (char) ('a' + j);  // getting alphabet characters
                   charact[i] = c;  // make this alphabet change on i'th index of str
                   
                   String s = String.valueOf(charact);
                   if(map.containsKey(s) && map.containsValue(false)){
                       queue.add(s);
                       map.put(s, true);     // Adding it in queue so make it true if it is valid and not visited
                   }
               }
           }
    }

    static int Ladder(String dictionary[],String start,String end){
        int n = dictionary.length;
        ArrayList<String> list = new ArrayList<>(n);

        for(int i = 0; i < dictionary.length; i++){
            list.add(i,dictionary[i]);
        }
        if( ! list.contains(end)) return 0;

        HashMap<String , Boolean> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
             map.put(list.get(i), false);
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        int length = 1;
       //   map.replace(start, false, true);
       map.put(start, true);

        while(!queue.isEmpty()) {
            int size =  queue.size();

            for(int i = 0; i < size; i++){
                String str = queue.poll();
                if(str.equals(end)){
                    return length;
                }
               matchWord(str, map, queue);  // Important function
            }
            length++;
        }

        return 0;
    }

    // Code work on only small words
    public static void main(String[] args) {
        String dictionary[] = {"abc", "aac", "bcd", "bac"};
        String start = "aba";
        String end = "bac";

        System.out.println(Ladder(dictionary, start, end));
        

    }
}
