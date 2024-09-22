import java.util.*;
public class areaOfRectangle {
    public static int findArea(int height,int width){
        return height*width;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle.");
        int a = obj.nextInt();
        System.out.println("Enter the width of the rectangle.");
        int b = obj.nextInt();
        int area = findArea(a,b);
        System.out.println("The area of the rectangle is "+area+" square unit.");
    }
}
