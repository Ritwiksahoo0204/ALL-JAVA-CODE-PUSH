import java.util.*;
public class doubleArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=obj.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" element of the array: ");
            array[i]=obj.nextInt();
        } 
        System.out.print("The original array is ==) ");
        for (int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("The doubled array is ==) ");
        for (int i=0;i<size;i++){
            System.out.print(2*array[i]+" ");
        }
    }
    
}
