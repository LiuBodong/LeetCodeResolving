package sdu.edu.simple;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-07-13 10:00:14
 * Version: 1.0
 * Description: Created by 刘伯栋
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        };
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            int key = Arrays.hashCode(str.chars().sorted().toArray());
            if (hashMap.containsKey(key)) {
                hashMap.get(key).add(str);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str);
                hashMap.put(key, arrayList);
            }
        }
        return new ArrayList<>(hashMap.values());
    }

}
