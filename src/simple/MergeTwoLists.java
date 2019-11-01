package simple;

/**
 * Author       刘伯栋
 * Version      1.0
 * Date:        2019/10/29 下午4:22
 * Description: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(4);
        l1.next = l11;
        l11.next = l12;
        l12.next = l13;
        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        ListNode l22 = new ListNode(5);
        ListNode l23 = new ListNode(7);
        l2.next = l21;
        l21.next = l22;
        l22.next = l23;
        ListNode res = mergeTwoLists(l1, l2);
        while (res != null) {
            System.out.println(res);
            res = res.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return this.val + "";
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode res = null;
        while (true) {
            if (l1 == null) {
                if (l2 == null) {
                    break;
                } else {
                    if (res == null) {
                        res = l2;
                        head = res;
                    } else {
                        res.next = l2;
                        res = res.next;
                    }
                    l2 = l2.next;
                }
            } else {
                if (l2 == null) {
                    if (res == null) {
                        res = l1;
                        head = res;
                    } else {
                        res.next = l1;
                        res = res.next;
                    }
                    l1 = l1.next;
                } else {
                    if (l1.val < l2.val) {
                        if (res == null) {
                            res = l1;
                            head = res;
                        } else {
                            res.next = l1;
                            res = res.next;
                        }
                        l1 = l1.next;
                    } else {
                        if (res == null) {
                            res = l2;
                            head = res;
                        } else {
                            res.next = l2;
                            res = res.next;
                        }
                        l2 = l2.next;
                    }
                }
            }
        }
        return head;
    }

}
