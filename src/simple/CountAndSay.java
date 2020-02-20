package simple;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-02-20 10:54:48
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/count-and-say/
 */

public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }

    /**
     * Count and say
     *
     * @param n the n-th level
     * @return result string.
     */
    public static String countAndSay(int n) {
        int i = 1;
        String res = "1";
        while (i < n) {
            i++;
            res = describe(res);
        }
        return res;
    }

    /**
     * 解析
     *
     * @param str input
     * @return result string.
     */
    public static String describe(String str) {
        if (str.length() == 1) {
            return 1 + str;
        }
        StringBuilder sb = new StringBuilder();
        char pre = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char now = str.charAt(i);
            if (pre == now) {
                count++;
            } else {
                sb.append(count);
                sb.append(pre);
                pre = now;
                count = 1;
            }
        }
        sb.append(count);
        sb.append(pre);
        return sb.toString();
    }

}
