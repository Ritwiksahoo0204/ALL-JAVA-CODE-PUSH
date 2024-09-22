import java.util.*;
public class function3 {
    public static int  calculateProduct(int num1,int num2){
        int product=num1*num2;
        return product;       
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=obj.nextInt();
        System.out.print("Enter the number: ");
        int b=obj.nextInt();
        int product=calculateProduct(a, b);
        System.out.print("The product of two numbers is "+ product);
    }
}
