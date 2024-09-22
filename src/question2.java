import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=obj.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }
        System.out.print("The array is ==) ");
        for (int i=0;i<size;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        int currentSum=array[0];
        int maxSum=array[0];
        for (int i=1;i<array.length;i++){
            currentSum=(currentSum+array[i]);
            //System.out.print(currentSum+" ");
            maxSum=Math.max(maxSum,currentSum);
            System.out.println(maxSum);
        }
        //System.out.print(maxSum+" ");

    }
}
