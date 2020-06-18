package sdu.edu.simple;

import java.util.HashMap;

/**
 * @author 刘伯栋
 * @version 1.0
 * @date: 2019/10/29 下午2:55
 * @description: https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = map.get(s.charAt(i));
            if (i < s.length() - 1) {
                int y = map.get(s.charAt(i + 1));
                if (x < y) {
                    x = -x;
                }
            }
            res += x;
        }
        return res;
    }

}
