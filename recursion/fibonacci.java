package recursion;
import java.util.*;
public class fibonacci {
    public static void fibonacci(int firstTerm,int secondTerm,int totalTerm) {
        if (totalTerm==0) {
            return;
        }
        int nextTerm=firstTerm+secondTerm;
        System.out.print(nextTerm+" ");
        fibonacci(secondTerm, nextTerm, totalTerm-1);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int term=obj.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibonacci(a, b, term-2);
        

        
    }
}
