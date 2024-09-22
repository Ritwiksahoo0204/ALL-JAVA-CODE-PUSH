import java.util.*;
public class Q01_pattern_solid_rectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        System.out.print("Enter the number of column: ");
        int c=obj.nextInt();
        //outer loop
        for (int i=1;i<=r;i++){
            // /inner loop 
            for (int j=1;j<=c;j++){
                System.out.print("* ");
            }
        System.out.println(); //for new line
        }
    }
    
}
