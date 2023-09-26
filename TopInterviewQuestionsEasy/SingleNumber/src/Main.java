import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(nums));
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            i++;
        }
        return nums[(nums.length-1)];
    }
}