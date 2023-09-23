import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums ={1,1,1};
        Solution solution=new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int k= nums.length;
        int control=0;
        int temp = nums[0];
        for(int i=0;i<k;i++){
            if(temp!=nums[i]) {
                control = 0;
                temp = nums[i];
            }
            if(temp == nums[i] && control<=1){
                control++;
            }else{
                int j=i;
                while(j<k-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                nums[k-1]=temp;
                k--;
                i--;
            }
        }
        return k;
    }
}