import java.util.*;
public class Q17_pattern_half_pyramid_with_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter total row number you want: ");
        int r=obj.nextInt();
        for(int i=1;i<=r;i++){
            //for space 
            // for (int j=1;j<=r-i;j++){
            //     System.out.print(" ");
            // }
            //for numbers
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
