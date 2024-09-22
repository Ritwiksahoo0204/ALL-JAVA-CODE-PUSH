import java.util.*;
public class arraySorting {
    public static void swap(int num1,int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        // System.out.println(num1);
        // System.out.println(num2);
        
        
    } 
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int array[]=new int[size];
        for (int i=0;i<array.length;i++){
            array[i]=obj.nextInt();
        }
        System.out.print("The array is ==) ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=0;i<array.length-1;i++){
            for(int j=1;j<array.length;j++){
                if(array[i]>array[j]){
                    swap(array[i],array[j]);
                }
                System.out.print(array[i]+ " ");
                System.out.println(array[j]+" ");
            }
            System.out.println();
        }

    }
}
