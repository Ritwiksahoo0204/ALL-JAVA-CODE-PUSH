import java.util.*;
public class number_table {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= obj.nextInt();
        for (int i=1;i<=10;i++){
            int mul=num*i;       
            System.out.println(num+ "*" + i +" = "+mul);
        }
        
       
        
    }    

}
