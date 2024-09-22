import java.util.*;
public class Q07_pattern_inverted_half_pyramid_with_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        //outer loop
        for(int i=1;i<=r;i++){
            //System.err.println(i);
            for(int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
            
    
    }
}


