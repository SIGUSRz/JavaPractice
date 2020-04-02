package LeetCode;

import Util.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test_2 {
    private Add_Two_Numbers solution = new Add_Two_Numbers();

    @Test
    public void sample1() {
        int[] a1 = {2, 4, 3};
        ListNode l1 = ListNode.buildLinkedList(a1);
        int[] a2 = {5, 6, 4};
        ListNode l2 = ListNode.buildLinkedList(a2);
        int[] ans = {7, 0, 8};
        ListNode answer = ListNode.buildLinkedList(ans);
        ListNode result = solution.addTwoNumbers(l1, l2);
//        assertThat(ListNode.compareLinkedList(answer, result));
    }
}
