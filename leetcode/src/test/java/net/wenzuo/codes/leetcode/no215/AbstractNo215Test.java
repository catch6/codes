package net.wenzuo.codes.leetcode.no215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2023-03-12
 */
abstract class AbstractNo215Test {

    abstract AbstractNo215 getNo215();

    AbstractNo215 no215 = getNo215();

    @Test
    void findKthLargest1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int actual = no215.findKthLargest(nums, k);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findKthLargest2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int actual = no215.findKthLargest(nums, k);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

}