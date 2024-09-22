import java.util.*;
public class fibonacci_series {
    public static int fibonacciSeries(int num){
        if (num<=0)
            return 0;
        else if(num==1)
            return 1;
        else{         
            return fibonacciSeries(num-1)+fibonacciSeries(num-2);
        }       
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();
        for (int i=0;i<num;i++)
        System.out.print(fibonacciSeries(i));
       
    }
    
}
