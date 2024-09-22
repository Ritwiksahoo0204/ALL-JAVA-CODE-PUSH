import java.util.*;
public class Q12_palyndromic_number_pyramid {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter row number ");
        int r=obj.nextInt();
        //int number = 1;
        for (int i=1;i<=r;i++){
            //inner loop for space 
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            //inner loop for number in reverse
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //inner loop for number in order avoiding 1st number
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            
        System.out.println();
                        
        }
                        
    }
    
}
