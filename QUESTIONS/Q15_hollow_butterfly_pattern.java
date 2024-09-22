import java.util.*;
public class Q14_hollow_butterfly_pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter row number ");
        int r=obj.nextInt();
        for (int i=1;i<=r;i++){
            //for *
            for (int j=1;j<=i;j++){
                if (j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }//for space
            for(int j=1;j<=2*(r-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if(j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
        System.out.println();
            
        }
        for (int i=r;i>=1;i--){
            //for *
            for (int j=1;j<=i;j++){
                if (j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }//for space
            for(int j=1;j<=2*(r-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if(j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
        System.out.println();
            
        }
       
    }
}
