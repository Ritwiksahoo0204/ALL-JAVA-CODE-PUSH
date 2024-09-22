public class reverse2 {
    public static void main(String args[]){
        StringBuilder obj=new StringBuilder("hello world");
        for (int i=0;i<obj.length()/2;i++){
            int front=i;
            int back=obj.length()-1-i;
            char frontChar=obj.charAt(front);
            char backChar=obj.charAt(back);
            obj.setCharAt(front, backChar);
            obj.setCharAt(back, frontChar);
        }
        System.out.println(obj);
    }
    
}
