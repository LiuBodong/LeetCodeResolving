package sdu.edu.simple;

import sdu.edu.utils.ListNode;

/*
 * Author:      刘伯栋
 * Time:        2020-06-21 10:32
 * Version:     1.0
 * Description: https://leetcode-cn.com/problems/linked-list-cycle
 */
public class HasCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (first != null && second != null && second.next != null) {
            second = second.next.next;
            first = first.next;
            if (second == first) {
                return true;
            }
        }
        return false;
    }

}
