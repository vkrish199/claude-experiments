package dsa.easy;

public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i = 0; i<prices.length-1; i++) {
            if(prices[i+1] < min) {
                min = prices[i+1];
            } else if(prices[i+1]-min > maxProfit) {
                maxProfit = prices[i+1]-min;
            }
            
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        test(new int[]{7, 1, 5, 3, 6, 4}, 5);
        test(new int[]{7, 6, 4, 3, 1}, 0);
        test(new int[]{2, 4, 1}, 2);
        test(new int[]{1}, 0);
    }

    private static void test(int[] prices, int expected) {
        int result = maxProfit(prices);
        boolean pass = result == expected;
        System.out.printf("prices=%s -> got=%d expected=%d [%s]%n",
                java.util.Arrays.toString(prices), result, expected, pass ? "PASS" : "FAIL");
    }
}
