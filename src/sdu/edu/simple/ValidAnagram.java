package sdu.edu.simple;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-07-13 09:47:37
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/valid-anagram/
 */

public class ValidAnagram {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // 记录字符出现次数
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        // 如果有次数不为0的，则返回false
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
