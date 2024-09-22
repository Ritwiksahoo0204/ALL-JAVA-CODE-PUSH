import java.util.*;
public class circumference {
    public static double calculateCircumference(int r){
        double pi=3.14;
        double circumference=2*pi*r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter the radius of the circle: ");
        int a=obj.nextInt();
        double circumference=calculateCircumference(a);
        System.out.println(circumference);
        
    }  
}
