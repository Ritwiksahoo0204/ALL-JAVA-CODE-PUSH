import java.util.*;
public class Q09_pattern_rhombus{
  public static void main (String [] args){
    Scanner obj=new Scanner (System.in);
    System.out.print("Enter row number ");
    int r=obj.nextInt();
    System.out.print("Enter column number ");
    int c=obj.nextInt();
    for (int i=1;i<=r;i++){
      for (int j=r-i;j>=1;j--){
        System.out.print(" ");
      }
      for(int j=1;j<=r;j++){
        System.out.print("*");
      }
     System.out.println();
    }
  }
}