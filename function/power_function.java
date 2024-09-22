import java.util.*;
public class power_function {
    public static double calculateExponent(int num1, int exponentValue){
        double exponent=Math.pow(num1, exponentValue);
        return exponent;
    }
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();
        System.out.print("Enter exponential value: ");
        int exponentValue = obj.nextInt();
        System.out.println(calculateExponent(num, exponentValue));
        
    }
    
}
