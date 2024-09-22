import java.sql.Array;
import java.util.*;
public class removePrimeFromArrayList {
    public static void sloution(Array array[]) {
        for(int i=array.length;i<=0;i--){
            int val=array[i];
            if(isPrime(val)==true){
                
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the Array ==) ");
        int size=obj.nextInt();
        int arrayList[]=new int[size];
        for (int i=0;i<arrayList.length;i++){
            System.out.print("Enter the "+(i+1)+" element of the array ==)");
            arrayList[i]=obj.nextInt();
        }
        System.out.println();
        System.out.print("The original array is ==) ");
        for (int i=0;i<arrayList.length;i++){
           System.out.print(arrayList[i]+" ");     
        }
        System.out.println(sloution(arraylist));
    }
}
