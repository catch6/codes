package net.wenzuo.codes.leetcode.No1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Catch
 * @since 2022-04-26
 */
abstract class AbstractNo1Test {

    No1 no1;

    @Test
    void twoSum1() {
        int[] arr = {2, 7, 11, 15};
        int[] result = no1.twoSum(arr, 9);
        Arrays.sort(result);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum2() {
        int[] arr = {3, 2, 4};
        int[] result = no1.twoSum(arr, 6);
        Arrays.sort(result);
        Assertions.assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void twoSum3() {
        int[] arr = {3, 3};
        int[] result = no1.twoSum(arr, 6);
        Arrays.sort(result);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }

}