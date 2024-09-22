package bitmanipulation;

public class getBit {
    public static void main(String[] args) {
        int i=9;
        int pos=2;
        int bitMask= 1<<pos;
        if ((bitMask & i)==0){
            System.out.println("3rd bit was 0");
        } else {
            System.out.println("3rd bit was 1");
        }

    }
    
}
