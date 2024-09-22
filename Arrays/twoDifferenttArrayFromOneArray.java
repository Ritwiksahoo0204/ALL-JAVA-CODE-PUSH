public class twoDifferenttArrayFromOneArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int middle=array.length/2;
        int array1[]=new int[middle];
        int array2[]=new int[array.length - middle];
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0;i<middle;i++){
            array1[i]=array[i];
            System.out.print(array1[i]+" ");
        } 
        System.out.println();
        for(int i=middle;i<array.length;i++){
            array2[i-middle]=array[i];
            System.out.print(array2[i-middle]+" ");
        }

        
    }
    
}
