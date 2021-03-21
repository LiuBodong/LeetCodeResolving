package sdu.edu.medium;

import java.util.HashMap;

/**
 * @author: liubodong
 * @date: 2021/3/21 上午10:50:51
 * @description: LongestSubstringWithoutRepeatingCharacters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        // 左右指针
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            char c = s.charAt(end);
            // 如果有重复字符了
            if (map.containsKey(c)) {
                start = Math.max(map.get(c), start);
            }
            max = Math.max(max, end - start + 1);
            map.put(c, end + 1);
            end++;
        }
        return max;
    }

}
