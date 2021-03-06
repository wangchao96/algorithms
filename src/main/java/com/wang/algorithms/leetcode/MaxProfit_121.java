package com.wang.algorithms.leetcode;

public class MaxProfit_121 {
    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     *
     * 注意你不能在买入股票前卖出股票。
     *
     * 示例 1:
     *
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
     * 示例 2:
     *
     * 输入: [7,6,4,3,1]
     * 输出: 0
     * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
     */

    /**
     * 暴力法
     *
     *
     * 复杂度分析
     *
     * 时间复杂度：O(n^2)。循环运行 n(n-1)/2 次。
     *
     * 空间复杂度：O(1)。只使用了两个变量 —— maxprofit 和 profit。
     */
    class Solution1 {
        public int maxProfit(int prices[]) {
            int maxprofit = 0;
            int profit;
            for (int i = 0; i < prices.length - 1; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    profit = prices[j] - prices[i];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            return maxprofit;
        }
    }

    /**
     * 一次遍历
     *
     *
     * 复杂度分析
     *
     * 时间复杂度：O(n)。只需要遍历一次。
     *
     * 空间复杂度：O(1)。只使用了两个变量。
     */
    class Solution2 {
        public int maxProfit(int[] prices) {
            int minprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                minprice = minprice < prices[i] ? minprice : prices[i];
                maxprofit = maxprofit > prices[i] - minprice ? maxprofit : prices[i] - minprice;
            }
            return maxprofit;
        }
    }
}
