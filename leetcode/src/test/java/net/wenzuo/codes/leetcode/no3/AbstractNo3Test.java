package net.wenzuo.codes.leetcode.no3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-27
 */
abstract class AbstractNo3Test {

    AbstractNo3 abstractNo3 = getAbstractNo3();

    abstract AbstractNo3 getAbstractNo3();

    @Test
    void lengthOfLongestSubstring1() {
        String input = "abcabcbb";
        int result = abstractNo3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring2() {
        String input = "bbbbb";
        int result = abstractNo3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(1, result);
    }

    @Test
    void lengthOfLongestSubstring3() {
        String input = "pwwkew";
        int result = abstractNo3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring4() {
        String input = "tmmzuxt";
        int result = abstractNo3.lengthOfLongestSubstring(input);
        Assertions.assertEquals(5, result);
    }

}