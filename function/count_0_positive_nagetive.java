//code 1
import java.util.*;
public class count_0_positive_nagetive {
    public static void main(String args[]) {
        
        Scanner obj =new Scanner (System.in);
        System.out.print("Enter total number you want ");
        int n=obj.nextInt();
        int countPositive=0;
        int countNagetive=0;
        int countZero=0;
        //int x='a';
        for (int i= 1;i<=n;i++){
            System.out.print("Enter "+i+" number :");
            int m=obj.nextInt(); 
            if (m==0){
                countZero++;
            }else if(m>0){
                countPositive++;
            }else if(m<0){
                countNagetive++;
            }
             
        }
        System.out.println(countZero);
        System.out.println("positive number "+countPositive);  
        System.out.println("nagetive number "+countNagetive);

    }
    
}

/* 
//code 2
import java.util.*;


public class count_0_positive_nagetive {
   public static void main(String args[]) {
       int positive = 0, negative = 0, zeros = 0;
       System.out.println("Press 1 to continue & 0 to stop");
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();


       while(input == 1) {
           System.out.println("Enter your number : ");
           int number = sc.nextInt();
           if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }


           System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
       }


       System.out.println("Positives : "+ positive);
       System.out.println("Negatives : "+ negative);
       System.out.println("Zeros : "+ zeros);
   }   
}
*/
