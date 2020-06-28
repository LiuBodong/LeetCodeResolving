package sdu.edu.simple;

/*
 * Author:      刘伯栋
 * Time:        2020-06-21 08:42
 * Version:     1.0
 * Description: https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(41));
    }


    // 递归
    public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static int climbStairs2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
