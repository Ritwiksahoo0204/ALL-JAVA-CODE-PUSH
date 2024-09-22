package recursion;

public class power {
    public static int power(int mainTerm,int powerTerm){
        if (mainTerm==0) {
            return 0;
        }
        if (powerTerm==0) {
            return 1;
        }
        int xPownm1=power(mainTerm, powerTerm-1);
        int xPown=mainTerm*xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        System.out.println(power(0, 1));

    }
    
}
