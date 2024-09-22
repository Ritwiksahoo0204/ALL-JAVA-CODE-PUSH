import java.util.*;
public class number {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        System.out.println("size: ");
        int []array=new int [size];
        //input
        for (int i=0;i<size;i++){
            System.out.println((i+1)+"element: ");
            array[i]=obj.nextInt();
        }
        int positive=0;
        int negative=0;
        int odd=0;
        int even=0;
        int zero=0;
        for (int i=0;i<size;i++){
            if(array[i]==0){
                zero++;
            }
            if(array[i]>0){
                positive++;
            }
            if (array[i]<0){
                negative++;
            }
        }
        for (int i=0;i<size;i++){
            if(array[i]%2==0){
                if(array[i]==0){
                continue;
                }else{
                even++;
                }
            }else{
                odd++;
            }
        }
        System.out.println("zero "+zero);
        System.out.println("positive "+positive);
        System.out.println("negative "+negative);
        System.out.println("even "+even);
        System.out.println("odd "+odd);
    }

 
    

}