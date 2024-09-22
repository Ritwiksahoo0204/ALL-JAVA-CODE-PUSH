public class reverseString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        // for(int i=0;i<str.length()/2;i++){
        //     int front=i;
        //     int back=str.length()-1-i;

        //     char frontCharacter=str.charAt(front);
        //     char backCharacter=str.charAt(back);

        //     str.setCharAt(front, backCharacter);
        //     str.setCharAt(back, frontCharacter);

        //     //System.out.println(str);
        // }
        //System.out.println(str);


        //another process
        StringBuilder newStr= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            newStr.append(str.charAt(str.length()-1-i));
        }
        System.out.println(newStr);
    }  
}
