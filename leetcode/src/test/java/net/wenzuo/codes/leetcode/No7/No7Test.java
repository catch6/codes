package net.wenzuo.codes.leetcode.No7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-05-05
 */
class No7Test {

    private final No7 no7 = new No7();

    @Test
    void reverse1() {
        int result = no7.reverse(123);
        Assertions.assertEquals(321, result);
    }

    @Test
    void reverse2() {
        int result = no7.reverse(-123);
        Assertions.assertEquals(-321, result);
    }

    @Test
    void reverse3() {
        int result = no7.reverse(120);
        Assertions.assertEquals(21, result);
    }

    @Test
    void reverse4() {
        int result = no7.reverse(0);
        Assertions.assertEquals(0, result);
    }

}