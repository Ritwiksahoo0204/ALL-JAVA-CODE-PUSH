import java.util.*;
public class findSumAndProduct {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of thee array: ");
        int size=obj.nextInt();
        int [] array=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element of the array: ");
            array[i]=obj.nextInt();
        }
        //for sum
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+array[i];
        }
        System.out.println("Sum of the array elements is "+sum);
        
        //for product
        int product=1;
        for(int i=0;i<size;i++){
            product=product*array[i];

        }
        System.out.println("Product of the array element is "+product);
    }
}
