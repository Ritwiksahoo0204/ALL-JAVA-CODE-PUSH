package recursion;

public class print5To1 {
    public static void printNum(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String args[]){
        int i=5;
        printNum(i);
    }
}
