package sdu.edu.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(0, 2 * n, "", list);
        return list;
    }

    public static void generate(int level, int max, String s, List<String> list) {
        // terminator
        if (level >= max) {
            if (valid(s)) {
                list.add(s);
            }
        } else {
            // drill down
            generate(level + 1, max, s + "(", list);
            generate(level + 1, max, s + ")", list);
        }
    }

    public static boolean valid(String s) {
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                left--;
                if (left < 0) {
                    return false;
                }
            }
        }
        return left == 0;
    }

}
