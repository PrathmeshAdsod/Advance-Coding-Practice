
class StarPattern {
    public static void main(String[] args) {
        int j = 6 , k = 6;
        for(int a = 0 ; a < 11; a++){
            for(int i = 0; i < 11; i++) {
                if(i == k || i == j){
                    if(i == j){
                       System.out.print("*");
                       j--;
                    }
                    if(i == k){
                       System.out.print("*");
                       k++;
                     }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}