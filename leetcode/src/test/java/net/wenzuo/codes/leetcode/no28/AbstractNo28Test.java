package net.wenzuo.codes.leetcode.no28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2023-04-13
 */
abstract class AbstractNo28Test {

    AbstractNo28 instance = getInstance();

    protected abstract AbstractNo28 getInstance();

    @Test
    void test1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int actual = instance.strStr(haystack, needle);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int actual = instance.strStr(haystack, needle);
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }

}