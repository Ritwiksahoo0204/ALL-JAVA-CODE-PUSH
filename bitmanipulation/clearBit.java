package bitmanipulation;

public class clearBit {
    public static void main(String[] args) {
        int n=8;
        int pos=3;
        int bitMask=1<<pos;
        int result = ~(bitMask) & n;
        System.out.println(result);; 
        
        
    }
    
}
