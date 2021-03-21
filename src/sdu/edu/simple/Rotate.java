package sdu.edu.simple;

/*
 * Author:      刘伯栋
 * Time:        2020-06-21 11:04
 * Version:     1.0
 * Description:
 */
public class Rotate {

    public static void main(String[] args) {
        Rotate rotate = new Rotate();
        int[] nums = new int[] {1,2,3,4,5,6,7};
        rotate.rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public void sawp(int[] nums, int a, int b) {
        int v = nums[a];
        nums[a] = nums[b];
        nums[b] = v;
    }

}
