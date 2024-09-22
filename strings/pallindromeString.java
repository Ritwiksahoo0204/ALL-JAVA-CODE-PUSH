import java.sql.SQLTimeoutException;
import java.util.*;
public class pallindromeString {
    // public static boolean isPallindrome(String ss){
    //     int i=0;
    //     int j=ss.length()-1;
    //     while (i<=j) {
    //         char char1=ss.charAt(i);
    //         char char2=ss.charAt(j);
    //         if (char1!=char2){
    //             return false;
    //         }else{
    //             i++;
    //             j--;
    //         }
    //     }
    //     return true;
    // }
    public static void solution(String name){
        for (int i=0;i<name.length();i++){
            for (int j=i+1;j<name.length();j++){
                String ss=name.substring(i, j);
                // if(isPallindrome(ss)==true){
                    System.out.println(ss);
                // }
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name=obj.next();
        solution(name);
    }
}
