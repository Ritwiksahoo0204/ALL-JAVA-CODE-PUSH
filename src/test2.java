import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter the number of row ");
        int r=obj.nextInt();
        System.out.print("Enter the number of column ");
        int c=obj.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                if (j==1||j==i||j==c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
