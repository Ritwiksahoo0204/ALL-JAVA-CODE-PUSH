/* 
01. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
*/
import java.util.*;
public class question1 {
    public static void main(String args[]) {
       Scanner obj = new Scanner(System.in);
       System.out.print("enter the size of the array ==) ");
       int size=obj.nextInt();
       String array[]=new String[size];
       int totalLength=0;
       for(int i=0; i<size; i++) {
            array[i] = obj.next();
            totalLength += array[i].length();
            //System.out.println(totalLength);
        }
 
        System.out.println(totalLength);
    }
   
}
