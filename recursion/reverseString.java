package recursion;

public class reverseString {
    public static void printReverse(String str,int index){
        if (index==0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str, index-1);
    }
    public static void main(String[] args) {
        String name="RITWIK";
        int index=name.length()-1;
        printReverse(name, index);
    }
}
