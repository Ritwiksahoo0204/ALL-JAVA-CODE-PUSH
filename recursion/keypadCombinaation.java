package recursion;

public class keypadCombinaation {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keypadCombinaation(String key, int index, String combination ){
        if (index==key.length()) {
            System.out.println(combination);
            return;
        }
        char currChar=key.charAt(index);
        String mapping = keypad[currChar-'0'];
        for (int i=0;i<mapping.length();i++){
            keypadCombinaation(key, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        keypadCombinaation(str, 0, "");
    }
}
