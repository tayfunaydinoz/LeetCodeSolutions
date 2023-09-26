import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int k = 3;
        Solution solution = new Solution();
        solution.rotate(nums,k);


        System.out.println("Hello world!");
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        if (k == 0) {return;}
        k = k % nums.length;

        int[] temp = new int[nums.length];

        System.arraycopy(nums, nums.length - k, temp, 0, k);
        System.arraycopy(nums, 0, temp, k, nums.length - k);
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}

////// Time exceeded
class Solution1 {
    public void rotate(int[] nums, int k) {
        if(k==0){return;}
        k=k%nums.length;
        int temp = nums[nums.length-1];
        int i = nums.length-1;
        while(0<i){
            nums[i]=nums[i-1];
            i--;
        }
        nums[0]=temp;
        if(k>1){
            k--;
            rotate(nums,k);
        }
    }
}