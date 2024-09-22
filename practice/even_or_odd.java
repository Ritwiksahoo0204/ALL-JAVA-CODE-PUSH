import java.util.*;

public class even_or_odd {
    public static void main(String[]args){
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();
        if (num%2==0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number.");
            obj.close();
        }
        }
    }
    
