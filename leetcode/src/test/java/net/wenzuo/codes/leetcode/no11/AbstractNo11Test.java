package net.wenzuo.codes.leetcode.no11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-26
 */
abstract class AbstractNo11Test {

    No11 no11;

    @Test
    void maxArea1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int actual = no11.maxArea(height);
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

}