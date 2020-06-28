package sdu.edu.medium;


import sdu.edu.utils.ListNode;

/*
 * Author:      刘伯栋
 * Time:        2020-06-21 10:15
 * Version:     1.0
 * Description:
 */
public class SwapPairs {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode node = swapPairs(node1);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    // 1->2->3->4->5->6
    // 2->1->4->3->6->5

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }

}
