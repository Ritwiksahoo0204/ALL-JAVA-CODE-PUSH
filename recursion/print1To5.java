package recursion;

public class print1To5 {
    public static void printNum(int n){
        if (n==6) {
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[]){
        int i=1;
        printNum(i);
    }
}
