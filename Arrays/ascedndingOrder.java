import java.util.*;
public class ascedndingOrder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of thee array: ");
        int size=obj.nextInt();
        int [] array=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element of the array: ");
            array[i]=obj.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                isAscending=false;
            }
        }
        if (isAscending){
            System.out.println("This is in ascending order.");
        }else{
            System.out.println("This is not in ascending order.");
        }
              
        
    }
}
