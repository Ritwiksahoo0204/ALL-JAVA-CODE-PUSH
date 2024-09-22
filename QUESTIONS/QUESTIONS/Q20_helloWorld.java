import java.util.*;
public class Q20_helloWorld {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //System.out.print("Enter the row you want ==) ");
        int row=12;
        //System.out.print("Enter the column you want ==) ");
        int column=40;
        for(int i=0;i<row/2-1;i++){
            for(int j=0;j<column/4-1;j++){
                if (j==0||j==column/4-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=row/2-1;i<row/2+1;i++){
            System.out.println(" ");
        }

        for(int i=row/2+1;i<row;i++){
            System.out.println("0");
        }
    }
}
