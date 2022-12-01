/*
 * MIT License
 *
 * Copyright (c) 2022 Catch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.wenzuo.codes.leetcode.No2;

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
