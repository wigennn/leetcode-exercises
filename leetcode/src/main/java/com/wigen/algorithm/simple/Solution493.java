package com.wigen.algorithm.simple;

/**
 * <p>
 *
 * </p>
 *
 * @author wangwq
 */
public class Solution493 {

    static class Solution {
        public int islandPerimeter(int[][] grid) {
            int sum = 0;

            int w = 0;
            int h = 0;
            for (int i = 0; i < (h = grid.length); i++) {
                for (int j = 0; j < (w = grid[i].length); j++) {
                    int k = grid[i][j];
                    if (k == 1) {
                        // 上下左右
                        if ((j - 1) < 0) {
                            sum += 1;
                        } else {
                            if (grid[i][j - 1] == 0) sum += 1;
                        }

                        if ((j + 1) >= w) {
                            sum += 1;
                        } else {
                            if (grid[i][j + 1] == 0) sum += 1;
                        }

                        if (i - 1 < 0) {
                            sum += 1;
                        } else {
                            if (grid[i - 1][j] == 0) sum += 1;
                        }

                        if (i + 1 >= h) {
                            sum +=1;
                        } else {
                            if (grid[i + 1][j] == 0) sum += 1;
                        }
                    }
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] pa = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        int re = solution.islandPerimeter(pa);
        System.out.println(re);
    }
}
