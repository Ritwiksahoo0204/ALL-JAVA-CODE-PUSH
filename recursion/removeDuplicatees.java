package recursion;

public class removeDuplicatees {
    public static boolean map[]=new boolean[26];
    public static void removeDuplicatees(String str, int index,String newString){
        if (index==str.length()-1) {
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        if (map[currChar-'a']==true) {
            removeDuplicatees(str, index+1,newString);
        } else {
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicatees(str, index+1, newString);

        }
    }
    public static void main(String[] args) {
        String str="abbayhbabyaajj";
        removeDuplicatees(str, 0, "");
    }
}
