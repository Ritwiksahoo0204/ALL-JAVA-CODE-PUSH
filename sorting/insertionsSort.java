package sorting;

import java.util.Scanner;

public class insertionsSort {
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
        //insertion sort
        for (int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        
        System.out.println("sorted array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
