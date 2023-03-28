package net.wenzuo.codes.leetcode.no121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2023-03-13
 */
abstract class AbstractNo121Test {

    abstract AbstractNo121 getAbstractNo121();

    AbstractNo121 abstractNo121 = getAbstractNo121();

    @Test
    void maxProfit1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = abstractNo121.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxProfit2() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int actual = abstractNo121.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }

}