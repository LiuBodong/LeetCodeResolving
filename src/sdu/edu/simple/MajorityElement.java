package sdu.edu.simple;

/*
 * Author: liubodong
 * Date: 2020/8/24
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/majority-element/
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.compute(num, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
        Map.Entry<Integer, Integer> res = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (res == null || entry.getValue() > res.getValue()) {
                res = entry;
            }
        }
        return res.getKey();
    }

}
