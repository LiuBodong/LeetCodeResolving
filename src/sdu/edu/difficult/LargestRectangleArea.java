package sdu.edu.difficult;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-06-28 10:02:30
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/largest-rectangle-in-histogram/submissions/
 */

public class LargestRectangleArea {

    public static void main(String[] args) {
        int[] heights = new int[]{2, 0, 2};
        System.out.println(largestRectangleArea(heights));
    }

    // 普通解法
    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            int sum = heights[i];
            int step = 1;
            // 从当前柱子向左查找
            while (i - step >= 0) {
                if (heights[i - step] >= heights[i]) {
                    sum += heights[i];
                    step++;
                } else {
                    break;
                }
            }
            step = 1;
            // 从当前柱子向右查找
            while (i + step < heights.length) {
                if (heights[i + step] >= heights[i]) {
                    sum += heights[i];
                    step++;
                } else {
                    break;
                }
            }
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }

}
