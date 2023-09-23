import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] nums = {0,1,2,2,3,0,4,2};
       int val = 2;
       Solution solution = new Solution();
       System.out.println(solution.removeElement(nums,val));
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int result=nums.length;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==val && i<result){
                int j=i;
                int temp = nums[j];
                while(j<result-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                nums[result-1]=temp;
                result--;
                if(nums[i]==val){
                    i--;
                }
            }

        }
        //System.out.println(Arrays.toString(nums));
        return result;
    }
}