package sdu.edu.simple;

/*
 * Author:      刘伯栋
 * Time:        2020-06-18 22:22
 * Version:     1.0
 * Description: httpcd s://leetcode-cn.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int position = nums.length - 1;
            int i = position;
            while (i >= 0) {
                if (nums[i] == 0 && i != position) {
                    for (int j = i; j < position; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[position--] = 0;
                }
                i--;
            }
        }
    }

}
