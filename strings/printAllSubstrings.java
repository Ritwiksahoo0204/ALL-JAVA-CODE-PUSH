import java.util.*;
public class printAllSubstrings {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name=obj.nextLine();
        System.out.print("original string is ==) "+ name+".");
        for (int i=0;i<name.length();i++){
            for (int j=i+1;j<=name.length();j++){
                System.out.println(name.substring(i, j));
            }
        }
    }
}
