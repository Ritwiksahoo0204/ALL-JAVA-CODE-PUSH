import java.util.*;
public class MatrixTranspose {
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
        System.out.println("The original matrix is: ");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(oldMatrix[i][j]+"  ");
            }
            System.out.println();
        }

        int newMatrix[][]=new int[column][row];
        System.out.println("The transposed matrix is ");
        for(int i=0;i<column;i++){
            for (int j=0;j<row;j++){
                newMatrix[i][j]=oldMatrix[j][i];
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
