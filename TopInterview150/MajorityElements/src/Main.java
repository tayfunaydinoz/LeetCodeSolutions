import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    class Solution {
        public int majorityElement(int[] nums) {
            if(nums.length<2){
                return nums[0];
            }
            Arrays.sort(nums);
            return nums[(int)(nums.length/2)];
        }
    }
}