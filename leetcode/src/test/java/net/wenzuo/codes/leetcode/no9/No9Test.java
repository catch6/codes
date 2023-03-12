package net.wenzuo.codes.leetcode.no9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-29
 */
class No9Test {

    private final No9 no9 = new No9();

    @Test
    void isPalindrome1() {
        int x = 121;
        boolean result = no9.isPalindrome(x);
        Assertions.assertTrue(result);
    }

    @Test
    void isPalindrome2() {
        int x = -121;
        boolean result = no9.isPalindrome(x);
        Assertions.assertFalse(result);
    }

    @Test
    void isPalindrome3() {
        int x = 10;
        boolean result = no9.isPalindrome(x);
        Assertions.assertFalse(result);
    }

}