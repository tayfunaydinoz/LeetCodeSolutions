// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] prices = {4,2,1,7};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
        
    }
}

//second solution
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)return 0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}

////first solution
class Solution1 {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=prices[0];
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i] && prices.length-1>i){
                if(0<max-min){
                    profit=profit+max-min;
                }
                min=prices[i];
                max=prices[i+1];
            }
            if(max<prices[i]){
                max=prices[i];
            }
            if((prices.length-2>i) && (prices[i]>prices[i+1])){
                if(0<max-min){
                    profit=profit+max-min;
                }
                min=prices[i+1];
                max=prices[i+2];
                i++;
            }
        }
        if(0<max-min){
            profit=profit+max-min;
        }
        return profit;
    }
}