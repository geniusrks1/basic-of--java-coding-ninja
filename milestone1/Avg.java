import java.util.Scanner;
public class Avg {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

        
        String str=s.next();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        
        
        
        int avg=0;
        avg=(a+b+c)/3;
        
        
        System.out.println(str.charAt(0));
        System.out.print(avg);
		
	}

}
