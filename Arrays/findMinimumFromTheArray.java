import java.util.*;
public class findMinimumFromTheArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of thee array: ");
        int size=obj.nextInt();
        int [] array=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element of the array: ");
            array[i]=obj.nextInt();
        }
        int min=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }else{
                min=min;
            }
            
        }
        System.out.println("The minimum number of the array is "+min);

    }
    
}
