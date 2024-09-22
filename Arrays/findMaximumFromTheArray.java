import java.util.*;
public class findMaximumFromTheArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of thee array: ");
        int size=obj.nextInt();
        int [] array=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element of the array: ");
            array[i]=obj.nextInt();
        }
        int max=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }else{
                max=max;
            }           
        }
        System.out.println("The maximum number is "+max);
    }
}
