import java.util.*;
public class arrayRotation {
    public static void rotation(){
        int lastElement=n-1;
        for(int i=n-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=array[lastElement];
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //int size=obj.nextInt();
        int array[]={1,2,3,4,5,6,7};
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        rotation(array,array.length);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        
    }
}
