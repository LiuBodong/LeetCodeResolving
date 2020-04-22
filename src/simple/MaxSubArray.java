package simple;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-03-26 10:55:30
 * Version: 1.0
 * Description: Created by 刘伯栋
 */

public class MaxSubArray {

    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            int sum = 0;
            int ans = nums[0];
            for (int num: nums) {
                if (sum > 0) {
                    sum += num;
                } else {
                    sum = num;
                }
                ans = Math.max(ans, sum);
            }
            return ans;
        }
    }



}
