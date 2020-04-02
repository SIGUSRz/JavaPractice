package LeetCode;

import Util.ListNode;

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode ptr = root;
        int result, carry = 0;
        while (l1 != null || l2 != null) {
            result = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = result > 9 ? 1 : 0;
            result %= 10;
            if (ptr != null) {
                ptr.next = new ListNode(result);
                ptr = ptr.next;
            } else {
                root = new ListNode(result);
                ptr = root;
            }
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if (carry > 0) {
            ptr.next = new ListNode(carry);
        }
        return root;
    }
}
