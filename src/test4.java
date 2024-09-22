import java.util.Scanner;

public class test4 {
   public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter the number of row you want: ");
        int row=obj.nextInt();
        System.out.print("Enter the number of column you want: ");
        int column=obj.nextInt();
        int oldMatrix[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                oldMatrix[i][j]=obj .nextInt();
            }
        }

        
    } 
}
