import java.util.Scanner;

public class elementOfTheArrayOrNot {
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
        System.out.print("Enter the element ypu want to check: ");
        int element=obj.nextInt();
        boolean found=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(number[i][j]==element){
                    found=true;
                }
            }
        }
        if (found){
            System.out.println("Element is in thi array.");
        }else{
            System.out.println("Element is not in this array.");
        }
        
    } 
}
