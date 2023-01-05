import java.util.Scanner;
public class Ascii {

    public static int calculateASCII(char ch) {
        return ch;
      }

      public static void main(String[]x){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(calculateASCII(str.charAt(0)));

      }
    
}
