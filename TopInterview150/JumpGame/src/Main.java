public class Main {
    public static void main(String[] args) {

        int[] nums = {3,2,1,0,4};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }
}

class Solution {

    public boolean callBack(int[] nums,int index) {
        if(nums[index]==0){return false;}
        int temp =index;
        if(index==nums.length-1){return true;}
        while(0<temp){
            if(callBack(nums,index)){
                return true;
            }
            temp--;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        return callBack(nums,0);
    }
}