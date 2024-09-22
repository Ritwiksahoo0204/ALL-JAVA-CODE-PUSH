import java.util.*;
public class sum_of_all_odd_number {
    public static int calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if (i%2==1){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter the number: ");
        int a=obj.nextInt();
        int sum=calculateSum(a);
        System.out.print(sum);
        
    }
    
}
