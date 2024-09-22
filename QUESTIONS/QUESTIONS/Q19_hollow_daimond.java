import java.util.*;
public class Q19_hollow_daimond {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter row number ");
        int r=obj.nextInt();
       
        for (int i=1;i<=r;i++){
            
            
            for (int j=r;j>=i;j--){
                System.out.print("* ");
            }
            for (int j=1;j<=2*(i-1);j++){
                System.out.print("  ");

            }
            for (int j=r;j>=i;j--){
                System.out.print("* ");
            }
            
            System.out.println();
                         
        }
         for (int i=r;i>=1;i--){
            
            
            for (int j=r;j>=i;j--){
                System.out.print("* ");
            }
            for (int j=1;j<=2*(i-1);j++){
                System.out.print("  ");

            }
            for (int j=r;j>=i;j--){
                System.out.print("* ");
            }
            
            System.out.println();
                         
        }
        

    }

}
