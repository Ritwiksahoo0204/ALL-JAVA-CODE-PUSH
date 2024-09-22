import java.util.*;
public class Q05_pattern_180DEGREE_ROTATE_invert_half_pyramid {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        //for outer loop
        for (int i=1;i<=r;i++){
            //inner loop for space
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            //inner loop for print *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}
