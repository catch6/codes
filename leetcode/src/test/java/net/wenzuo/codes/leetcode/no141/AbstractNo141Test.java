package net.wenzuo.codes.leetcode.no141;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2023-04-13
 */
abstract class AbstractNo141Test {

    AbstractNo141 instance = getInstance();

    abstract AbstractNo141 getInstance();

    @Test
    void test1() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        boolean actual = instance.hasCycle(node1);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;
        boolean actual = instance.hasCycle(node1);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        ListNode node1 = new ListNode(1);
        boolean actual = instance.hasCycle(node1);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

}