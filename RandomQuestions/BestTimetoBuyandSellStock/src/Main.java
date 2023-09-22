// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] prices ={4,11,2,1,7};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));

    }
}
/*for (int j = i+1; j < prices.length; j++) {
                if((prices[j]-prices[i])>profit){
                    profit = prices[j]-prices[i];
                }
            }*/
class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int min=prices[0];
        int max=prices[0];
        for (int i = 0; i < prices.length; i++) {

            if(prices[i]<min && i < prices.length-1){
                if(profit<max-min){
                    profit=max-min;
                }
                min=prices[i];
                max=prices[i+1];
            }
            if(prices[i]>max){
                max=prices[i];
            }
            if(profit<max-min){
                profit=max-min;
            }
        }
        return profit;
    }
}
/// Time Exceededd
class Solution2 {
    public int maxProfit(int[] prices) {
        int profit =0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if((prices[j]-prices[i])>profit){
                    profit = prices[j]-prices[i];
                }
            }
        }
        return profit;
    }
}

/// Time Exceededd
class Solution1 {
    public boolean transactionable(int[] prices){
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length-1;j++){
                if(prices[i]<prices[j+1]){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxProfit(int[] prices) {
        int profit =0;
        if(transactionable(prices)) {
            for (int i = 0; i < prices.length; i++) {
                for (int j = i+1; j < prices.length; j++) {
                    if((prices[j]-prices[i])>profit){
                        profit = prices[j]-prices[i];
                    }
                }
            }
            return profit;
        }
        return profit;
    }
}