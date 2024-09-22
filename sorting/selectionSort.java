package sorting;
import java.util.*;;
public class selectionSort {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int size=obj.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.print("The main array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //selection sort
        for (int i=0;i<arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[smallest]) {
                    smallest=arr[j];
                }
            
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            
        }
        System.out.println("sorted array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
