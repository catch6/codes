package net.wenzuo.codes.leetcode.no2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-26
 */
class No2Test {

    private final No2 no2 = new No2();

    @Test
    void addTwoNumbers1() {
        ListNode l1 = getListNode(2, 4, 3);
        ListNode l2 = getListNode(5, 6, 4);
        ListNode result = no2.addTwoNumbers(l1, l2);
        Assertions.assertTrue(equals(result, 7, 0, 8));
    }

    @Test
    void addTwoNumbers2() {
        ListNode l1 = getListNode(0);
        ListNode l2 = getListNode(0);
        ListNode result = no2.addTwoNumbers(l1, l2);
        Assertions.assertTrue(equals(result, 0));
    }

    @Test
    void addTwoNumbers3() {
        ListNode l1 = getListNode(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = getListNode(9, 9, 9, 9);
        ListNode result = no2.addTwoNumbers(l1, l2);
        Assertions.assertTrue(equals(result, 8, 9, 9, 9, 0, 0, 0, 1));
    }

    private boolean equals(ListNode listNode, int... numbers) {
        ListNode ptr = listNode;
        for (int number : numbers) {
            if (ptr.val != number) {
                return false;
            }
            ptr = ptr.next;
        }
        // ptr!=null 则说明长度不相等
        return ptr == null;
    }

    private ListNode getListNode(int... numbers) {
        if (numbers.length == 0) {
            return null;
        }
        ListNode ptr = null;
        for (int i = numbers.length - 1; i >= 0; i--) {
            ptr = new ListNode(numbers[i], ptr);
        }
        return ptr;
    }

}