import java.util.*;
public class test {
    public static void indexOfTwoElement(int arr[],int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("["+i+","+j+"]");
                    return;
                } else {
                    continue;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int size=obj.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.print("The array elements are ==>");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the target number you want ==>");
        int target=obj.nextInt();
        System.out.print("Indexes of target numbers are : ");
        indexOfTwoElement(arr, target);

    }
}
    

