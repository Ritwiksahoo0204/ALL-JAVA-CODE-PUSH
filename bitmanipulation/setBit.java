package bitmanipulation;

public class setBit {
    public static void main(String[] args) {
        int i=1;
        int pos=2;
        int bitMask=1<<pos;
        int newNumber= bitMask | i;
        System.out.println(newNumber);
    }
}
