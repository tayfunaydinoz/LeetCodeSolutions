import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target=9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1=0;
        int index2=0;
        for(int i=0;i<nums.length;i++){
            index1=i;
            for(int j=i+1;j< nums.length;j++){
                if(nums[index1]+nums[j]== target){
                    index2=j;
                    return new int[]{index1, index2};
                }
            }
        }
        return new int[]{index1, index2};
    }
}