package sdu.edu.medium;

import sdu.edu.utils.ListNode;

/*
 * Author:      刘伯栋
 * Time:        2020-06-21 10:57
 * Version:     1.0
 * Description: https://leetcode-cn.com/problems/linked-list-cycle-ii
 */
public class DetectCycle {

    public ListNode find(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (first != null && second != null && second.next != null) {
            second = second.next.next;
            first = first.next;
            if (second == first) {
                return first;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode intersect = find(head);
        if (intersect == null) {
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}
