import java.util.*;
public class reverseString {
    public static void reversedString(String name){
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name=obj.nextLine();
        System.out.println(name);
        reversedString(name);
        
    }
    
}