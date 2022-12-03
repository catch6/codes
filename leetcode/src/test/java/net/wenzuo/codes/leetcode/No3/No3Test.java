package net.wenzuo.codes.leetcode.No3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-27
 */
class No3Test {

    private final No3 no3 = new No3();

    @Test
    void lengthOfLongestSubstring1() {
        String input = "abcabcbb";
        int result = no3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring2() {
        String input = "bbbbb";
        int result = no3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(1, result);
    }

    @Test
    void lengthOfLongestSubstring3() {
        String input = "pwwkew";
        int result = no3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring4() {
        String input = "tmmzuxt";
        int result = no3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(5, result);
    }

}