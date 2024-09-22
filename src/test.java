import java.util.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter total row number you want: ");
        int r=obj.nextInt();
        for(int i=1;i<=r;i++){
            
            for(int j=r-i;j>=1;j--){
                System.out.print("   ");
            }


            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=r-1;i>=1;i--){
            //for reverse
            for(int j=r-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        
    }
}
