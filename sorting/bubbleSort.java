package sorting;
import java.util.*;

public class bubbleSort {
    // public static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }

    // ====> not working

    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("enter array size: ");
        int size =obj.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("the main array is");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the sorted array is ");
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}

// ==> working
//     public static void main(String[] args) {
//         int arr[]={7,8,3,1,2};
//         for (int i=0;i<arr.length-1;i++){
//             for (int j=0;j<arr.length-1-i;j++){
//                 if (arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         printArray(arr);
        
//     }
// }