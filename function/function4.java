import java.util.*;
public class function4 {
    public static void printFactorial(int number){
        int factorial=1;
        if (number<0){
            System.out.print("Invalid number to calculate factlrial");
            return;
        }
        
        if (number==0||number==1){
            factorial=1;
            System.out.println(factorial);
            return;
        }
        
        if (number>1){
            for (int i=number;i>=1;i--){
                factorial=factorial*i;
                //System.out.println(factorial);
            }
            System.out.println("The factorial of the number is "+factorial);
            return;
            
            
        }
        
    }
    
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter the number: ");
        int a=obj.nextInt();
        printFactorial(a);

    }
    

}
