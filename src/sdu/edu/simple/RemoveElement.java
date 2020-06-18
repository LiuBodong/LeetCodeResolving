package sdu.edu.simple;

/**
 * Author : 刘伯栋 Version : 1.0 Date : 2020年1月7日 下午8:09:08 Description :
 * https://leetcode-cn.com/problems/remove-element/
 */

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int len = removeElement(nums, val);
		System.out.println(len);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	/**
	 * https://leetcode-cn.com/problems/remove-element/
	 * 
	 * @param nums 传入数组
	 * @param val  待比较值
	 * @return 数组长度
	 */
	public static int removeElement(int[] nums, int val) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (nums[i] == val) {
				nums[i] = nums[length - 1]; 
				length--;
				i--;
			}
		}
		return length;
	}

}
