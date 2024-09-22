import java.util.*;
public class numberEvenOrOdd {
    public static void checkEvenOrOdd(int num){
        if (num==0){
            System.out.println("0 is neither odd nor even number.");
        } else if (num%2==0){
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        checkEvenOrOdd(num);
    }
 
}
