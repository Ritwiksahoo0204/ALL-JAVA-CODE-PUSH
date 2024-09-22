import java.util.*;
public class Q08_pattern_Floyd_triangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        int number=1;
        //outer loop
        for(int i=1;i<=r;i++){
            //inner loop 
            for (int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
        System.out.println();

        }
            
        
    }
            
    
}
    

