import java.util.*;

public class grater_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        if(num1==num2){
            System.out.println("Equal.");
        }
        else{
            if(num1>num2){
                System.out.println(num1 + " is grater");
            }
            else{
                System.out.println(num2 + "is grater");
        }
    }
    }
    
}
