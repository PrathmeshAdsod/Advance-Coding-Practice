// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Kevin {
    public static void main(String[] args) {
        String str = "kdaabd";

        StringBuilder Ben = new StringBuilder(str);
        StringBuilder Kevin = new StringBuilder();
int i = 1;
        while(Ben.length() > 1) {
            char ch = Ben.charAt(i);
            char ch2 = Ben.charAt(i-1);

            if(ch - 'a' < ch2 - 'a') {
                  Kevin.append(ch);
                  Ben.deleteCharAt(i-1);
            }else {
                Kevin.append(ch2);
                Ben.deleteCharAt(i);
            }
            
        }
        Kevin.append(Ben.charAt(0));
System.out.println(Kevin.toString());
    }
}
