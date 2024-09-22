import java.util.*;
public class maxAmongThree {
    public static void graterAmongThree(int num1,int num2,int num3){
        if (num1>num2 && num1>num3){
            System.out.println(num1+" is grater number.");
        }else if (num2>num1 && num2>num3){
            System.out.println(num2+" is grater number.");
        }else{
            System.out.println(num3+" is grater number.");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=obj.nextInt();
        System.out.print("Enter second number: ");
        int num2=obj.nextInt();
        System.out.print("Enter third number: ");
        int num3=obj.nextInt();
        graterAmongThree(num1,num2,num3);

    }
}
