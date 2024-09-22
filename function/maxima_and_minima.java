import java.util.*;
public class maxima_and_minima {
    public static void calculateMaximaAndMinima(int num1, int num2,int num3){
        if(num1>num2&&num1>num3){
            System.out.println(num1+" is the maximum number.");
            if (num2<num3){
                System.out.println(num2+" is the minumun number.");
            }else if(num2>num3){
                System.out.println(num3+" is the minumun number.");
            }else{
                System.out.println(num2+" and "+num3+" are equal.");
            }
        }else if(num2>num1&&num2>num3){
            System.out.println(num2+" is the maximum number.");
             if (num1<num3){
                System.out.println(num1+" is the minumun number.");
            }else if(num1>num3){
                System.out.println(num3+" is the minumun number.");
            }else{
                System.out.println(num1+" and "+num3+" are equal.");
            }
        }else if(num3>num1&&num3>num2){
            System.out.println(num3+" is the maximum number.");
             if (num1<num2){
                System.out.println(num1+" is the minumun number.");
            }else if(num1>num2){
                System.out.println(num2+" is the minumun number.");
            }else{
                System.out.println(num1+" and "+num2+" are equal.");
            }
        }else{
            System.out.println("All are equal numbers.");
        }
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=obj.nextInt();
        System.out.print("Enter second number : ");
        int num2=obj.nextInt();
        System.out.print("Enter third number : ");
        int num3=obj.nextInt();
        calculateMaximaAndMinima(num1, num2, num3);

    }
}
