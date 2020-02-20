package simple;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-02-20 10:14:49
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/search-insert-position/
 */

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }

    /**
     * Binary search
     *
     * @param nums array of input ints
     * @param target the target int to search
     * @return index of the target in nums.
     */
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = nums[mid];

            if (midValue > target) {
                high = mid - 1;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }

}
