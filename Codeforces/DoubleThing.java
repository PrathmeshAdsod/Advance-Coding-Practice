
/*
import java.util.*;
import java.io.*;

public class DoubleThing{

    static int comparing(String A, String B) {
        int compare = A.compareTo(B);

        if (compare < 0) {
            return -1;
        } else if (compare > 0) {
           return 1;
        } 
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int z = 1; z <= T; z++) {

            sc.nextLine();
            String str = sc.nextLine();

            String firstSmaller = str;

            Set<String> strSet = new HashSet<>();

            StringBuilder requiredString = new StringBuilder(str);
           
            String first = str;

            for(int i = 0; i < str.length(); i++){

                 char letter = str.charAt(i);
                 first = first.substring(0, i+1);
                 String second = str.substring(i+1 , str.length());

                 first += letter;
                 first += second;
                 requiredString.append(first);

                 if(!strSet.contains(first)) {
                     strSet.add(first);
                     if(comparing(first , firstSmaller) == -1) {
                         firstSmaller = first;
                     }
                     else if(comparing(first , firstSmaller) == 1){
                         first = firstSmaller.substring(0,firstSmaller.length());
                     }
                 }else {
                    first = firstSmaller.substring(0,firstSmaller.length());
                 }

            }

            System.out.println("Case #" + z + ": "+firstSmaller);

        }
    }
}
*/


import java.util.*;
import java.io.*;

public class DoubleThing {

    static int comparing(String A, String B) {
        int compare = A.compareTo(B);

        if (compare < 0) {
            return -1;
        } else if (compare > 0) {
           return 1;
        } 
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int z = 1; z <= T; z++) {

            sc.nextLine();
            String str = sc.nextLine();

            String required = str;
        
            String first = "";
         
            for(int i = 0; i < str.length(); i++){

                char letter = str.charAt(i);
                first += letter;
                first += letter;

               

                String second = str.substring(i+1, str.length());

                String newStr = first + second;
                String newSec = required.substring(0,i)+ letter + second;

               
                     if(comparing(newStr, newSec) == -1){
                         required = newStr;
                     }else if(comparing(newStr,newSec) == 1) {
                         required = newSec;
                         first = first.substring(0,i);
                     }

                  

            }


            System.out.println("Case #" + z + ": "+required);

        }
    }
}
