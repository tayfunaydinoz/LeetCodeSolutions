import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] s ={'h','e','l','l','o'};
        Solution solution = new Solution();
        solution.reverseString(s);
    }
}
class Solution {
    public void reverseString(char[] s) {
        int loop=s.length;
        for(int i=0;i<loop;i++){
            char temp=s[i];
            s[i]=s[loop-1];
            s[loop-1]=temp;
            loop--;
        }
        System.out.println(Arrays.toString(s));
    }
}