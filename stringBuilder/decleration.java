public class decleration {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        //character at index==>
        System.out.println(str.charAt(4));
        
        //set char at index ==>
        str.setCharAt(0, 'u');
        System.out.println(str);

        //insert character==>
        str.insert(0, 'u');
        System.out.println(str);

        //append==>
        str.append('u');
        System.out.println(str);

        //delete ==>
        str.delete(1, 3);
        System.out.println(str);

        //length ==>
        System.out.println(str.length());
    }
    
}
