import java.util.*;
public class Q02_pattern_hollow_rectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        System.out.print("Enter the number of column: ");
        int c=obj.nextInt();
        // outer loop
        for (int i=1;i<=r;i++){
            // /inner loop 
            for (int j=1;j<=c;j++){
                if(i==1||j==1||i==r||j==c){
                    System.out.print("*");
                }else{
                    System.err.print(" ");
                }
                            
            }
        System.out.println();
        }
    }
}
