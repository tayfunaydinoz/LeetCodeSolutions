// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        Solution solution=new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        for(int i=0;i< k-1;i++){
            if(nums[i] == nums[i+1]){
                k--;
                int j=i;
                while(j<k){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    j++;
                }
                i--;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return k;
    }
}