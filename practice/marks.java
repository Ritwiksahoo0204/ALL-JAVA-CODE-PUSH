import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("choose 0 to stop\nchoose 1 to continue");
        int choice=obj.nextInt();
        if (choice==1){
            System.out.print("enter the number of subject: ");
            int number = obj.nextInt();
            int i=1,sum=0;
            do{
                System.out.print("enter the mark of "+ i +" subject: ");
                int mark=obj.nextInt();
                sum=sum+mark;
                i++;
            }while(i<=number);
            System.out.println(sum);
            float avarage= sum/number;
            System.out.println("You got "+ avarage +" marks.");
            if(avarage>=90){
                System.out.println("This is Good.");
            }else if(avarage<=89 && avarage>=60){
                System.out.println("This is also Good.");
            }else if(avarage<=59 && avarage>=0){
                System.out.println("This is Good as well.");
            }else{
                System.out.println("invalid number.");
            }
            
        } else if(choice==0){
            System.out.println("Okay you will check your number next time.");
        }else{
            System.out.println("Invalid input.");
        }
        
    }
    
}
