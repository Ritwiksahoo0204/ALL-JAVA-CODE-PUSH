import java.util.*;
public class primeOrNot {
    public static void isPrimeOrNot(int n){
        if (n==0 || n==1){
            System.out.println(n+" is not a prime number.");
            return;
        }
        for(int i=2;i<=n-1;i++){
            if (n%i==0){
                System.out.println(n+" is not a prime number.");
                return;
            } else {
                System.out.println(n+" is a prime number.");
                
                
            }
            
        }
        
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=obj.nextInt();
        isPrimeOrNot(num);

    }
    
}
