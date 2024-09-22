import java.util.*;
public class stringIsPallindromeOrNot {
    public static boolean isPallindrome(String s){
        
        int i=0;
        int j=s.length()-1;
        while (i<=j) {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                return false;
            } else{
                i++;
                j--;
            }
            
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name = obj.nextLine();
        if (isPallindrome(name)){
            System.out.println("String is pallindrome");
        } else {
            System.out.println("String is not pallindrome");
        }
    }
}
