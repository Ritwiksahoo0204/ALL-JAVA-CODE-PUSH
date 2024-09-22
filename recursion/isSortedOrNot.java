package recursion;

public class isSortedOrNot {
    //first process ❤️❤️❤️
    public static boolean isSorted1(int arr[], int index){
        if (index==arr.length-1) {
            return true;
        }
        if (arr[index]>=arr[index+1]) {
            return isSorted1(arr, index+1);
        } else {
            return false;
        }
    }

    // same same but differenr 😁😁
    public static boolean isSorted2(int arr[], int index){
        if (index==arr.length-1) {
            return true;
        }
        if (arr[index]>=arr[index+1]) {
            return false;
        } 
        return isSorted2(arr, index+1);
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,8,5,6};
        if (isSorted1(arr, 0)) {
            System.out.println("array is sorted.");
        } else {
            System.out.println("array is not sorted.");
        }
        if (isSorted2(arr, 0)) {
            System.out.println("array is sorted.");
        } else {
            System.out.println("array is not sorted.");
        }

    }
}
