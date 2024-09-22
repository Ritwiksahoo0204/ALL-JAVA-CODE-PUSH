package recursion;

public class towerOfHanoi {
    public static void towerOfHanoi (int noOfDisk, String source, String helper,String destination){
        int move=0;
        if (noOfDisk==1) {
            System.out.println("Disk "+ noOfDisk+ " move from tower "+source+" to tower "+ destination);
            return;
        }
        towerOfHanoi(noOfDisk-1, source, destination, helper);
        System.out.println("Disk "+noOfDisk+ " move from tower "+source+" to tower "+ destination);
        towerOfHanoi(noOfDisk-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n=6;
        String source="S",helper="H",destination="D";
        towerOfHanoi(n, source, helper, destination);


    }
}
