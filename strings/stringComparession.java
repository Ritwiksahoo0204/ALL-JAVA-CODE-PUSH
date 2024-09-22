import java.util.*;
public class stringComparession {
    public static String comparession1(String str){
        String s=str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            char current=str.charAt(i);
            char previous=str.charAt(i-1);
            if (current!=previous){
                s+=current;
            }
        }
        return s;
    }
    public static String comparession2(String str){
        int count=1;
        String s=str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            char current=str.charAt(i);
            char previous=str.charAt(i-1);
            if(current==previous){
                count++;
            }else{
                if(count>1){
                    s+=count;
                    count=1;
                }
                s+=current;
            }
            
        }
        if(count>1){
            s+=count;
        }
        return s;

    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        System.out.println(comparession2(str));
    }
}
