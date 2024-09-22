import java.util.*;
public class function1 {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter the name you want to print: ");
        String nam=obj.nextLine();
        printMyName(nam);//function call


    }
}
