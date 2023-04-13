package net.wenzuo.codes.leetcode.no121;

/**
 * 121. 买卖股票的最佳时机
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
 *
 * 思路:
 * 动态规划
 * 遍历数组，记录当前最小值和最大收益，更新最小值和最大收益即可。
 *
 * @author Catch
 * @since 2023-03-13
 */
class No121DP extends AbstractNo121 {

    @Override
    int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                continue;
            }
            int profit = prices[i] - min;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

}
