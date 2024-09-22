import java.util.*;
public class question1 {
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
        System.out.print("Enter the sum you want ");
        int sum1=obj.nextInt();
        System.out.println("the contiguous elements are ");
        for (int i=0;i<size;i++){
            int sum2=array[i];
            for(int j=i+1;j<size;j++){
                sum2+=array[j];
                if(sum2==sum1){
                    for(int k=i;k<=j;k++){
                        System.out.print(array[k]+" ");
                    }
                }
            }
            
            
        }
    }
}
