import java.util.*;
public class Eligibility_check {
    public static void checkEligibility(int age){
        if (age<18){
            System.out.println("You are not elegible for vote. please come after "+ (18-age)+" year later.");
        }else{
            System.out.println("Please collect your voting ticket. ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter your age : ");
        int age=obj.nextInt();
        checkEligibility(age);
        
    }
}
