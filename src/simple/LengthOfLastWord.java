package simple;

/*
 * Author:     刘伯栋
 * Date:       2020-04-22 星期三 10:00:50
 * Description: Created by 刘伯栋
 *
 * https://leetcode-cn.com/problems/length-of-last-word/
 *
 */

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {
        int totalLen = s.length() - 1;
        while (totalLen >= 0 && s.charAt(totalLen) == ' ') {
            totalLen--;
        }
        int i = totalLen;
        int len = 0;
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                len++;
            } else {
                return len;
            }
            i--;
        }
        return len;
    }

}
