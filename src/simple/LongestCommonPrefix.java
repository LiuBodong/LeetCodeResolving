package simple;

/**
 * Author       刘伯栋
 * Version      1.0
 * Date:        2019/10/29 下午3:29
 * Description: todo
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{""}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length < 1) {
            return sb.toString();
        } else if (strs.length == 1) {
            return strs[0];
        }
        int n = 0;
        boolean b = true;
        while (b) {
            for (int i = 0; i < strs.length - 1; i++) {
                b = b && n < strs[i].length() && n < strs[i + 1].length() && (strs[i].charAt(n) == strs[i + 1].charAt(n));
            }
            if (b) {
                sb.append(strs[0].charAt(n));
            }
            n += 1;
        }
        return sb.toString();
    }
}
