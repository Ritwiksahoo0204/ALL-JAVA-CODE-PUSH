import java.util.*;
public class calculater {
    public static int calculateSum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static int calculateSubtraction(int num1,int num2){
        int sub=num1-num2;
        return sub;
    }
    public static int calculateProduct(int num1,int num2){
        int product=num1*num2;       
        return product;
    }
    public static int calculateDivision(int num1,int num2){
        int div=num1/num2;
        return div;
    }
    public static int calculateModulo(int num1,int num2){
        int mod=num1%num2;      
        return mod;
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner (System.in);
        System.out.print("Enter the 1st number: ");
        int a=obj.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b=obj.nextInt();
        System.out.println("Enter which opetarion you want to do: ");
        String operation=obj.next();
        switch (operation) {
            case "+": int sum= calculateSum(a, b);
            System.out.println(sum);
            break;
            case "-": int sub= calculateSubtraction(a, b);
            System.out.println(sub);
            break;
            case "*": int mul= calculateProduct(a, b);
            System.out.println(mul);
            break;
            case "/": if (b==0){
                        System.out.println("Invalid division.");
                        } else{
                        int div= calculateDivision(a, b);
                        System.out.println(div);
                    }
            break;
            case "%": if (b==0){
                        System.out.println("Invalid division.");
                        } else{
                        int mod= calculateModulo(a,b);            
                        System.out.println(mod);
                    }
            break;
            default: System.out.println("invalid");            
        }        
    }
}