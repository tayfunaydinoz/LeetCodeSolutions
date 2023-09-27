import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        boolean allZero =false;
        for(int j=0;j<nums.length && !allZero;j++){
            if(nums[j]!=0){
                allZero = true;
            }
        }
        if(!allZero){
            return;
        }
        int loop= nums.length;
        for(int i =0; i<loop;i++){
            if(nums[i]==0){
                int counter =i;
                int temp =nums[i];
                while(counter<loop-1){
                    nums[counter]=nums[counter+1];
                    counter++;
                }
                nums[counter]=temp;
                if(i < loop-1 && nums[i]==0){
                    i--;
                }
                loop--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}