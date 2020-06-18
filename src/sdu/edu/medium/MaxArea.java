
package sdu.edu.medium;

/*
 * Author:     刘伯栋
 * Time:       2020-06-18 22:16
 * Version:    1.0
 * Description:https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea2(height));
    }

    /**
     * 傻逼解法，两个for
     *
     * @param height
     * @return
     */
    public static int maxArea1(int[] height) {
        int maxArea = 0;
        int length = height.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int w = j - i;
                int h = Math.min(height[i], height[j]);
                int newArea = w * h;
                if (newArea > maxArea) {
                    maxArea = newArea;
                }
            }
        }
        return maxArea;
    }

    /**
     * 牛逼解法，双指针
     *
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            maxArea = Math.max(area, maxArea);
            if (height[left] > height[right]) {
                right--;
            } else if (height[left] < height[right]) {
                left++;
            } else {
                right--;
                left++;
            }
        }
        return maxArea;
    }

}