import java.util.*;

public class Sum_of_first_n_natural_number {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();
        int sum=0;
        //using for loop
        // for(int i=1;i<=num;i++){
        //     sum=sum+i;
        // }
        // System.out.println("Sum of first "+ num +"number is " + sum );
        
        
        //using while
        // int i=0;
        // while (i<=num) {
        //     sum=sum+i;
        //     i++;    
        // }
        // System.out.println("Sum of first "+num+" natural number is "+sum);


        // using do while 
        int i=0;
        do{
            sum=sum+i;
            i++;
        }while(i<=num);
        System.out.println("Sum of first "+num+" natural number is "+sum);

    }    
}
