import java.util.*;
public class fibonacciSeries {
    public static void fibonacciSeries(int n){
        int firstTerm=0,secondTerm=1;
        for (int i=1;i<=n;i++){
            System.out.print(firstTerm+" ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=obj.nextInt();
        fibonacciSeries(n);
        
    }
}
