import java.util.*;
public class Fmult {
    public static double multiplyFloatingNumbers(double f1, double f2) {
        // Write your code here
        double ans=f1*f2;
        return ans;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double x=s.nextDouble();
        double y=s.nextDouble();
        System.out.print(multiplyFloatingNumbers(x,y));
    }
}