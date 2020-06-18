package sdu.edu.simple;

/**
 * Author       刘伯栋
 * Version      1.0
 * Date:        2019/11/1 上午11:29
 * Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 1, 2, 2, 3, 4, 5};
        System.out.println("-------------------------");
        System.out.println(removeDuplicates2(nums1));
        System.out.println("-------------------------");
        for (int i : nums1) {
            System.out.println(i);
        }
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("-------------------------");
        System.out.println(removeDuplicates2(nums2));
        System.out.println("-------------------------");
        for (int i : nums2) {
            System.out.println(i);
        }
        int[] nums3 = new int[]{1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 7, 7, 7};
        System.out.println("-------------------------");
        System.out.println(removeDuplicates2(nums3));
        System.out.println("-------------------------");
        for (int i : nums3) {
            System.out.println(i);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        } else {
            int len = 0;
            int tailLen = 0;
            for (int i = 0; ; ) {
                if (i < nums.length - tailLen - 1) {
                    if (nums[i] == nums[i + 1]) {
                        for (int j = i + 1; j < nums.length - tailLen - 1; j++) {
                            swap(nums, j + 1, j);
                        }
                        tailLen += 1;
                    } else {
                        i++;
                        len += 1;
                    }
                } else {
                    return len + 1;
                }
            }
        }
    }

    public static void swap(int[] nums, int idx1, int idx2) {
        int t = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = t;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
