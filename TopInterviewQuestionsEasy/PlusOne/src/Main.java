import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits ={9};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(digits)));
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int extra=0;
        int n = digits.length;
        if(digits[n-1]!=9) {
            digits[n - 1] += 1;
        }else{
            extra = 1;
        }
        while(extra==1 && n>0){
            if(digits[n-1]==9) {
                digits[n - 1] = 0;
                extra = 1;
            }else{
                digits[n - 1] += 1;
                extra =0;
            }
            n--;
        }
        if(digits[0]==0){
            int[] tempArray = new int[digits.length+1];
            tempArray[0]=1;
            System.arraycopy(digits, 0, tempArray,
                    1, digits.length-1);
            digits = tempArray;
        }
        return digits;
    }
}