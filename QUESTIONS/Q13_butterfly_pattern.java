import java.util.*;
public class Q13_butterfly_pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter row number ");
        int r=obj.nextInt();
        for (int i=1;i<=r;i++){
            //for *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }//for space
            for(int j=1;j<=2*(r-i);j++){
                System.out.print(" ");
            }
            //for *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
            
        }
        for (int i=r;i>=1;i--){
            //for *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }//for space
            for(int j=1;j<=2*(r-i);j++){
                System.out.print(" ");
            }
            //for *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
            
        }
    
    
    }
}
