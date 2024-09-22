import java.util.*;
public class userInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of row you want: ");
        int row=obj.nextInt();
        System.out.print("Enter the number of column you want: ");
        int column=obj.nextInt();
        //array initialization
        int number[][]=new int[row][column];
        //array input
        //outer for loop 
        for (int i=0;i<row;i++){
            //inner for loop 
            for(int j=0;j<column;j++){
                //inputs of the array
                number[i][j]=obj.nextInt();
            }
        }
        //array output
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}