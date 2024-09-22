package recursion;

public class firstAndLastOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void printOccurance(String str, int index, char c){
        if (index==str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(index);
        if (currChar==c) {
            if (first==-1) {
                first=index;  
            } else {
                last=index;
            }
        }
        printOccurance(str, index+1, c);
    }
    public static void main(String[] args) {
        String str="jkehkdjvnjvbdgjheuijerfghidfnvjkhcvjndvuihdvujebuhdjvhdjv";
        System.out.println(str.length()-1);
        printOccurance(str, 0, 'j');
    }
}
