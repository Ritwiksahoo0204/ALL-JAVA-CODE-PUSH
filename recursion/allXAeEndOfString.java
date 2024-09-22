package recursion;

public class allXAeEndOfString {
    public static void moveXToEnd(String str,int index,int count, String newString){
        char currChar = str.charAt(index);
        if (index==str.length()-1) {
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if (currChar=='x') {
            count++;
            moveXToEnd(str, index+1, count, newString);
        } else {
            newString+=currChar;
            moveXToEnd(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="xnbmnbhjcnxbznbxbxjxxxxxxgvhjdvbjhdgvhj";
        moveXToEnd(str, 0, 0, "");
    }
}
