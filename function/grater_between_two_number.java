import java.util.*;
public class grater_between_two_number {
    public static void graterBetweenTwoNumbers(int num1,int num2){
        if (num1>num2){
            System.out.println(num1+ " is grater");
        }else{
            System.out.println(num2+" is grater");
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a=obj.nextInt();
        System.out.print("Enter first number: ");
        int b=obj.nextInt();
        graterBetweenTwoNumbers(a, b);
        
        
    }
    
}
