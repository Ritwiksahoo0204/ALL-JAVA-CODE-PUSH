import java.util.*;
public class avarage {
    public static float calculateAvarage(int num1,int num2,int num3){
        float sum=num1+num2+num3;
        float avarage=sum/3;
        return avarage;
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter first number ");
        int a=obj.nextInt();
        System.out.print("Enter second number ");
        int b=obj.nextInt();
        System.out.print("Enter third number ");
        int c=obj.nextInt();
        float avarage=calculateAvarage(a, b, c);
        System.out.print( avarage);

    }
    
}
