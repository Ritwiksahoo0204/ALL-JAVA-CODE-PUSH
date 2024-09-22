import java.util.*;
public class Q11_pattern_pyramid {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter row number ");
        int r=obj.nextInt();
        int number = 1;
        for (int i=1;i<=r;i++){

            for(int j=1;j<=r-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
            }
           
            number++;
            System.out.println();
        }

        
    }
    
}
