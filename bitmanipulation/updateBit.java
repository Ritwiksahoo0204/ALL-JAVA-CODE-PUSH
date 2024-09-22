package bitmanipulation;
import java.lang.management.OperatingSystemMXBean;
import java.util.*;
public class updateBit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int result;
        int oper= obj.nextInt();
        // if (oper>=2){
        //     System.out.println("invalid binary choice.");
        //     return;
        // }else if (oper==1){
        //     int result=bitMask | n;
        //     System.out.println(result);
        // } else { 
        //     int newBitMask=~(bitMask);
        //     int result=(newBitMask & n);
        //     System.out.println(result);
        // }

        //by switch
        // switch (oper) {
        //     case 0: int newBitMask=~(bitMask);
        //             result=(newBitMask & n);
        //             System.out.println(result);
        //         break;
        //     case 1: result=bitMask | n;
        //             System.out.println(result);
        //     default:
        //         System.out.println("invalid");
        //         break;
        // }

        // another switch
        switch(oper){
            case 0 -> {
                    int newBitMask=~(bitMask);
                    result=(newBitMask & n);
                    System.out.println(result);
                }
            case 1 -> {
                result=bitMask | n;
                System.out.println(result);

            }
        };

    }
}
