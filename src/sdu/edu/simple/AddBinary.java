package sdu.edu.simple;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-06-30 17:01:11
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/add-binary/
 */

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lena = a.length();
        int lenb = b.length();
        int max = Math.max(lena, lenb);
        int n = 0;
        for (int i = 1; i <= max; i++) {
            int aPos = lena - i;
            int bPos = lenb - i;
            int achar = aPos >= 0 ? (a.charAt(aPos) == '0' ? 0 : 1) : 0;
            int bchar = bPos >= 0 ? (b.charAt(bPos) == '0' ? 0 : 1) : 0;
            int r = 0;
            switch (achar + bchar + n) {
            case 0:
                r = 0;
                break;
            case 1:
                r = 1;
                n = 0;
                break;
            case 2:
                r = 0;
                n = 1;
                break;
            case 3:
                r = 1;
                n = 1;
                break;
            default:
                break;
            }
            sb.append(r);
        }
        if (n > 0) {
            sb.append(n);
        }
        return sb.reverse().toString();
    }
}
