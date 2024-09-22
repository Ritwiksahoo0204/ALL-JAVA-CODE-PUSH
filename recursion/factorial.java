package recursion;

public class factorial {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }

        int fact=(n * factorial(n-1));
        System.out.println(n+" "+fact);
        return fact;
        
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
