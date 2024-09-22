
public class practice {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return i+","+j;
                }
            }

        }
    }
    public static void main(String[] args) {
        int num[]={1,2,5,6,9,7};
        int target=15;
        
    }
      
}
