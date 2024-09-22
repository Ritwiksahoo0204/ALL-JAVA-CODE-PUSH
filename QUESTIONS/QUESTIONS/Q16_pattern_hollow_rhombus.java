import java.util.*;
public class Q16_pattern_hollow_rhombus {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        for (int i=1;i<=r;i++){
            for(int j=r-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                if (i==1||i==r|j==1||j==r){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
