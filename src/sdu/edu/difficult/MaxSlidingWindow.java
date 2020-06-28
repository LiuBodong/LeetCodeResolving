package sdu.edu.difficult;

/*
 * Author:      刘伯栋
 * Time:        2020-06-28 21:48
 * Version:     1.0
 * Description:
 */
public class MaxSlidingWindow {

    public static void main(String[] args) {
        int nums[] = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int res[] = maxSlidingWindow(nums, 3);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k >= nums.length) {
            int max = 0;
            for (int num : nums) {
                if (max < num) {
                    max = num;
                }
            }
            return new int[]{max};
        }
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < res.length; i++) {
            int max = nums[i];
            for (int j = 1; j < k; j++) {
                if (max < nums[i + j]) {
                    max = nums[i + j];
                }
            }
            res[i] = max;
        }
        return res;
    }

}
