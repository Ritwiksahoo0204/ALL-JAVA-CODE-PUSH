import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=obj.nextInt();
        int array1[]=new int[size];
        //int middle=array1.length/2;
        System.out.print("the number you want too rotate: ");
        int k=obj.nextInt();
        int array2[]=new int[size];
        for (int i=0;i<size;i++){
            array1[i]=obj.nextInt();
        }
        System.out.print("The array is ==) ");
        for (int i=0;i<size;i++){
            System.out.print(array1[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<k;i++){
            array2[i]=array1[size-k+i];
           // System.out.print(array2[i]+" ");
        }
        for (int i=0;i<size-k;i++){
            array2[k+i]=array1[i];
            //System.out.print(array2[k+i]+" ");
        }
        System.out.println();
        System.out.print("The rotated array is ==) ");
        for (int i=0;i<size;i++){
            System.out.print(array2[i]+" ");
        }
    }   
}
