import java.util.*;
public class function2{
    public static int addTwoNumbers(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a=obj.nextInt();
        System.out.print("Enter first number: ");
        int b=obj.nextInt();
        int sum = addTwoNumbers(a, b);
        System.out.print("The sum of these two number is "+sum);
    
    }

}