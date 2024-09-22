/*
2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
*/

import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the original sentence you want");
        String sentence=obj.nextLine();
        String result="";
        for (int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)=='e'){
                result+='i';
            }else{
                result+=sentence.charAt(i);
            }
            System.out.println(result);
            System.out.println(result.length());
        }
        
    }
    // public static void main(String[] args) {
    //     Scanner obj=new Scanner(System.in);
    //     System.out.println("enter the original sentence you want");
    //     String sentence=obj.next();
    //     String result=sentence.replace('e','i');
        
    //     System.out.println(result);
        
        
    // }
}
