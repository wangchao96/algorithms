package com.wang.algorithms.leetcode;

public class ProjectionArea_883 {
    /**
     * 在 N * N 的网格中，我们放置了一些与 x，y，z 三轴对齐的 1 * 1 * 1 立方体。
     * <p>
     * 每个值 v = grid[i][j] 表示 v 个正方体叠放在单元格 (i, j) 上。
     * <p>
     * 现在，我们查看这些立方体在 xy、yz 和 zx 平面上的投影。
     * <p>
     * 投影就像影子，将三维形体映射到一个二维平面上。
     * <p>
     * 在这里，从顶部、前面和侧面看立方体时，我们会看到“影子”。
     * <p>
     * 返回所有三个投影的总面积。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：[[2]]
     * 输出：5
     * 示例 2：
     * <p>
     * 输入：[[1,2],[3,4]]
     * 输出：17
     * 解释：
     * 这里有该形体在三个轴对齐平面上的三个投影(“阴影部分”)。
     * <p>
     * 示例 3：
     * <p>
     * 输入：[[1,0],[0,2]]
     * 输出：8
     * 示例 4：
     * <p>
     * 输入：[[1,1,1],[1,0,1],[1,1,1]]
     * 输出：14
     * 示例 5：
     * <p>
     * 输入：[[2,2,2],[2,1,2],[2,2,2]]
     * 输出：21
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= grid.length = grid[0].length <= 50
     * 0 <= grid[i][j] <= 50
     */
    class Solution {
        public int projectionArea(int[][] grid) {
            int result = 0;
            for (int i = 0; i < grid.length; i++) {
                int maxXZ = 0;
                int maxYZ = 0;
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] > 0) result ++;
                    maxXZ = Math.max(maxXZ, grid[i][j]);
                    maxYZ = Math.max(maxYZ, grid[j][i]);
                }
                result += maxXZ;
                result += maxYZ;
            }
            return result;
        }
    }
}
