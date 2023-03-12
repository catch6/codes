package net.wenzuo.codes.algorithm.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Catch
 * @since 2022-12-02
 */
abstract class AbstractSortTest {

    Sort sort = getSort();

    abstract Sort getSort();

    @Test
    void sort1() {
        int[] arr = null;
        sort.sort(arr);
        int[] expect = null;
        Assertions.assertEquals(expect, arr);
    }

    @Test
    void sort2() {
        int[] nums = {};
        sort.sort(nums);
        int[] expect = {};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void sort3() {
        int[] nums = {3};
        sort.sort(nums);
        int[] expect = {3};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void sort4() {
        int[] nums = {3, 4, 5, 2, 1};
        sort.sort(nums);
        int[] expect = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void sort5() {
        int[] nums = {3, 2, 4, 5, 2, 1};
        sort.sort(nums);
        int[] expect = {1, 2, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void sort6() {
        Random random = new Random();
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = random.nextInt();
        }
        int[] expect = Arrays.copyOf(nums, nums.length);
        sort.sort(nums);
        Arrays.sort(expect);
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void sort7() {
        int[] nums = {3, 1, 2, 3};
        sort.sort(nums);
        int[] expect = {1, 2, 3, 3};
        Assertions.assertArrayEquals(expect, nums);
    }

}