package sdu.edu.difficult;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-06-29 08:08:02
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/trapping-rain-water/
 */

import java.util.ArrayDeque;

public class TrappingRainWater {

    public static void main(String[] args) {

    }

    public static int trap(int[] height) {
        ArrayDeque<Integer> st = new ArrayDeque<>(height.length);
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[st.peek()] < height[i]) {
                int cur = st.peek();
                st.pop();
                if (st.isEmpty()) break;
                int l = st.peek();
                int r = i;
                int h = Math.min(height[r], height[l]) - height[cur];
                ans += (r - l - 1) * h;
            }
            st.push(i);
        }
        return ans;
    }

}
