import java.util.*;
public class adult_or_not {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();
        if (age>=18){
            System.out.println("Adult.");
        }
        else{
            System.out.println("Not Adult.");
            obj.close();
        }
    }
    
}
