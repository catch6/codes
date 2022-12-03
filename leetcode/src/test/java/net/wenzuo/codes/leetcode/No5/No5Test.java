package net.wenzuo.codes.leetcode.No5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Catch
 * @since 2022-05-03
 */
class No5Test {

    private final No5 no5 = new No5();

    @Test
    void longestPalindrome1() {
        String s = "babad";
        String result = no5.longestPalindrome(s);
        List<String> expected = Arrays.asList("bab", "aba");
        Assertions.assertTrue(expected.contains(result));
    }

    @Test
    void longestPalindrome2() {
        String s = "cbbd";
        String result = no5.longestPalindrome(s);
        List<String> expected = Arrays.asList("bb");
        Assertions.assertTrue(expected.contains(result));
    }

}