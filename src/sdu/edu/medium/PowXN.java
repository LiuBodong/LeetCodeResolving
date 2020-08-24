package sdu.edu.medium;

/*
 * Author: liubodong
 * Date: 2020/8/24
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/powx-n/
 */

public class PowXN {

    public static void main(String[] args) {
        System.out.println(myPow(0, -2));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0D;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        double middle = myPow(x, n / 2);
        // odd number
        if ((n & 1) == 1) {
            return middle * middle * x;
        } else {
            // even number
            return middle * middle;
        }
    }

}
