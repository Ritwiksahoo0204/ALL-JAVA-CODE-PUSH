import java.util.*;
public class Q14_diamond_pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter row number ");
        int r=obj.nextInt();
        //upper part
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            // for(int j=1;j<=r-i;j++){
            //     System.out.print(" ");
            // }

         System.out.println();
        }
        for(int i=r;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }

         System.out.println();
        }
    }
}
