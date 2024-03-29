package net.wenzuo.codes.leetcode.no2;

/**
 * 2. 两数相加
 * https://leetcode.cn/problems/add-two-numbers/
 *
 * @author Catch
 * @since 2022-04-26
 */
class No2OfBasic extends AbstractNo2 {

    @Override
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        int sum;
        while (l1 != null || l2 != null || carry != 0) {
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            carry = sum / 10;
        }
        return head;
    }

}