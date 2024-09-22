import java.util.*;
public class doubleArray {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=obj.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            array[i]=obj.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
