import java.util.*;
public class Q09_pattern_01_triangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r=obj.nextInt();
        int sum=0;
        for(int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }

            
                    
            }
            sum+=r;
            System.out.println(sum);
            
        }
     


        
    }
}