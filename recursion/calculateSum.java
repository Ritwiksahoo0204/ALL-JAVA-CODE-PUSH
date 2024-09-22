package recursion;

public class calculateSum {
    public static int calculateSum(int i,int n,int sum){
        
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return sum;
        }
        sum+=i;
        return calculateSum(i+1, n,sum);
        
    }
    public static void main(String[] args) {
        calculateSum(1,5,0);;

    }
    
}
