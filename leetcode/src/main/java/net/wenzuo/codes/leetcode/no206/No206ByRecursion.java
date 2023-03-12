package net.wenzuo.codes.leetcode.no206;

/**
 * 通过递归实现
 *
 * @author Catch
 * @since 2023-03-12
 */
public class No206ByRecursion implements No206 {

    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(curr, next);
    }

}
