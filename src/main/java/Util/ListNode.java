package Util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode buildLinkedList(int[] arr) {
        ListNode root = null;
        ListNode ptr = root;
        for (int i : arr) {
            if (ptr != null) {
                ptr.next = new ListNode(i);
                ptr = ptr.next;
            } else {
                root = new ListNode(i);
                ptr = root;
            }
        }
        return root;
    }

    public static boolean compareLinkedList(ListNode l1, ListNode l2) {
        while (l1 != null & l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return (l1 == null && l2 == null);
    }
}
