package net.wenzuo.codes.leetcode.no25;

/**
 * @author Catch
 * @since 2023-03-09
 */
public class No25ByIterator implements No25 {

    @Override
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;

            pre = start;
            end = start;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
