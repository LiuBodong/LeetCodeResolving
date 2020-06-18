package sdu.edu.simple;

/*
 * Author:     刘伯栋
 * Date:       2020-04-22 星期三 10:54:42
 * Description: Created by 刘伯栋
 *
 * https://leetcode-cn.com/problems/plus-one/
 *
 */

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[] { 1, 2, 3 };
        System.out.println(toString(plusOne2(digits)));
    }

    public static String toString(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
            if (i != digits.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /**
     * 第一种实现方式
     * 
     * @param digits 输入
     * @return 输出
     */
    public static int[] plusOne1(int[] digits) {
        int len = digits.length - 1;
        do {
            digits[len]++;
            if (digits[len] != 10) {
                return digits;
            } else {
                digits[len] = 0;
            }
            len--;
        } while (len >= 0);
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (++digits[i]) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
