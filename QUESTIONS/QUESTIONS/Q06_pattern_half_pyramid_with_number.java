import java.util.*;
public class Q06_pattern_half_pyramid_with_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        //outer loop
        for(int i=1;i<=r;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
    
    }
}
