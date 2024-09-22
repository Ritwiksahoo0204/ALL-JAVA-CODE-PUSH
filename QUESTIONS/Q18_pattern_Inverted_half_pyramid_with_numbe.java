import java.util.*;
public class Q18_pattern_Inverted_half_pyramid_with_numbe {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter total row number you want: ");
        int r=obj.nextInt();
        
        for(int i=r;i>=1;i--){
            //for spaces
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
             }
            //  for numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            
            
            System.out.println();
        } 
        for(int i=2;i<=r;i++){
            //for spaces
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
             }
            //  for numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            
            
            System.out.println();
        } 

        
    }
}
