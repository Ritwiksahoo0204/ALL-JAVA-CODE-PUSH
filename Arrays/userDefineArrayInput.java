import java.util.*;
public class userDefineArrayInput {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int []array=new int [size];
        //input
        for (int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }
        int x=obj.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++){
            if (array[i]==x){
                found=true;
            }    
        } 
        if (found){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }   
}
