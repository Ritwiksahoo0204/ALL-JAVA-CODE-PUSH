import java.util.Scanner;

public class Q04_pattern_invert_half_pyramid {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        for (int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
        System.out.println();
        }
        
    }
}
