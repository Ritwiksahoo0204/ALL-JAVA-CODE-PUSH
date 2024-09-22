/* 
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/
import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the email ==) ");
        String email=obj.nextLine();
        String userName="";
        System.out.print("Your email address is : "+email);
        System.out.println();
        for (int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            } else {
                userName+=email.charAt(i);
            }
        }
        System.out.print("Your username is : "+userName);
    }
}
