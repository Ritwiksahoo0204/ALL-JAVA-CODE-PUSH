import java.util.*;
public class test5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter total row number you want (Minumum 4 rows): ");
        int r=obj.nextInt();
        System.out.print("Enter total column number you want(Minimum 20 columns): ");
        int c=obj.nextInt();
        System.out.println("HAPPY NEW YEAR ");
        // first part
        for (int i=0;i<r;i++){
            for(int j=0;j<c/4;j++){
                if(i==0||i==1||i==r-1||j==c/4-2||j==c/4-1){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=r;i>0;i--){
            for(int j=0;j<c/4;j++){
                if(j==0||j==1||i==r||i==2||i==1){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }        
        //second part
        System.out.println();
        for(int i=0;i<r;i++){
            for (int j=c/4;j<c/2;j++){
                if(i==0||i==1||j==c/4||j==c/4+1||j==c/2-1||j==c/2-2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
        for(int i=r;i>0;i--){
            for (int j=c/4;j<c/2;j++){
                if(i==2||i==1||j==c/4||j==c/4+1||j==c/2-1||j==c/2-2){
                    System.out.print("* ");
                }else{ 
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
        // 3rd part
        System.out.println();
        for (int i=0;i<r;i++){
            for(int j=c/2;j<3*c/4;j++){
                if (i==0||i==1||i==r-1||j==3*c/4-1||j==3*c/4-2){
                    System.out.print("* ");
                }else{
                System.out.print("  ");
                }                
            }
            System.out.println();
        }
        for (int i=r;i>0;i--){
            for(int j=c/2;j<3*c/4;j++){
                if (j==c/2||j==c/2+1||i==2||i==1||i==r){
                    System.out.print("* ");
                }else{
                System.out.print("  ");
                }                
            }
            System.out.println();
        }        
        //fourth part 
        System.out.println();
        for (int i=0;i<r;i++){
            for(int j=3*c/4;j<c;j++){
                if (i==r-1||j==3*c/4||j==3*c/4+1||j==c-2||j==c-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=r;i>0;i--){
            for(int j=3*c/4;j<c;j++){
                if (i==r||j==c-2||j==c-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }                
    }

}