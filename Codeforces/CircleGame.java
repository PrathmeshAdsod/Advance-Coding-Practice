import java.util.Scanner;

public class CircleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int z=1; z <= T; z++) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i <n; i++) {
                arr[i] = sc.nextInt();
            }

            int move = 1;
            int mike = arr[0];
            arr[0] = 0;
int joe = 0;
int count = 1;
String turn = "joe";
String ans = "";

while(count <= n) {
    move = (move % n)+1;
    if(arr[move-1] == 0 && turn.equals("mike")){
        ans = "Joe";
        break;
    } 
    if(arr[move-1] == 0 &&  turn.equals("joe")){
        ans = "Mike";
        break;
    } 

    if( turn.equals("mike")) {
        mike =mike+ arr[move-1];
        turn = "joe";
    }
    else if( turn.equals("joe")) {
        joe =joe+ arr[move-1];
        turn = "mike";
    }
    arr[move-1] = 0;
    count++;
}
if(ans.equals("")) ans = (mike > joe)? "Mike" : "Joe";
System.out.println(ans);




        }
    }
}
