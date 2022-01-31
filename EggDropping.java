
// Code is fine for recursive approach but its Time Complexity is exponential
// So it will give StackOverFlowError

public class EggDropping {

    static int eggDrop(int egg , int floor){

        int min = Integer.MAX_VALUE , res = 0;

        if(floor == 0 || floor == 1) return floor;

        if(egg == 0) return 0;

        if(egg == 1) return floor;

        for(int i = 0; i < floor; i++) {
            // eggDrop(egg - 1, floor)   -- not break
            // eggDrop(egg - 1, floor - 1)   -- egg break
            res = 1 + Math.max(eggDrop(egg , floor - i) , eggDrop(egg - 1, floor - 1));

            if(res < min) {
                min = res;
            }

        }

        return min;
    }

    public static void main(String[] args) {

        int floor = 2 , eggs = 2;

        System.out.print("Minimum number of "
        + "trials in worst case with "
        + eggs + " eggs and " + floor
        + " floors is " + eggDrop(eggs, floor));

        
    }
}
