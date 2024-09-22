import java.util.*;
public class findGCD {
    public static int findGCD(int num1,int num2){
        int temp,gcd;
        while (num2!=0) {
            
            temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        gcd=num1;
        return gcd;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter first number ");
        int num1=obj.nextInt();
        System.out.print("Enter second number ");
        int num2=obj.nextInt();
        System.out.println("GCD of these two number is "+findGCD(num1,num2));
    }    
}
