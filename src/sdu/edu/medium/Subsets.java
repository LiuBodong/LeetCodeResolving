package sdu.edu.medium;

/*
 * Author: liubodong
 * Date: 2020/8/24
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/subsets/
 */

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<>(curr) {

                    private static final long serialVersionUID = 1L;

                    {
                        add(num);
                    }
                });
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }

}
