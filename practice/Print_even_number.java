import java.util.*;

public class Print_even_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= obj.nextInt();
        
        //using for 
        // for(int i=2;i<=num;i++){
        //     if (i%2==0){
        //         System.out.print(i +" ");
        //     }
        // }

        //using while
        // int i=0;
        // while (i<=num) {
        //     if (num==0){
        //         System.out.println(num+" is neither even nor odd. ");
        //     }else if (i%2==0){
        //         System.out.println(i);
        //     }
        //     i++;
            
        // }


        //using do while 
       
       int i=0;
        do{
            if (num==0){
                System.out.println(num+" is neither even nor odd. ");
            }else if (i%2==0){
                System.out.println(i);
            }
            i++;
       }while(i<=num);
    }
}
