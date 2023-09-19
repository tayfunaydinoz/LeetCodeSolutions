import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        Solution solution = new Solution();
        solution.merge(nums1,1,nums2,1);


    }
}
class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=m;i<n;i++){
            nums1[j]=nums2[i];
            j++;
        }
        for(int k=0;k<m+n-1;k++) {
            int Temp = nums1[k + 1];
            int i = k;
            while (i >= 0) {
                if (Temp < nums1[i]) {
                    nums1[i + 1] = nums1[i];
                    nums1[i] = Temp;
                    i--;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}