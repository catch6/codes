package net.wenzuo.codes.algorithm.sort;

import net.wenzuo.codes.algorithm.sort.Sort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Catch
 * @since 2022-06-20
 */
interface SortTest {

    Sort getInstance();

    @Test
    default void sort1() {
        int[] nums = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> getInstance().sort(nums));
    }

    @Test
    default void sort2() {
        int[] nums = {};
        getInstance().sort(nums);
        int[] expect = {};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    default void sort3() {
        int[] nums = {3};
        getInstance().sort(nums);
        int[] expect = {3};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    default void sort4() {
        int[] nums = {3, 4, 5, 2, 1};
        getInstance().sort(nums);
        int[] expect = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    default void sort5() {
        int[] nums = {3, 2, 4, 5, 2, 1};
        getInstance().sort(nums);
        int[] expect = {1, 2, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    default void sort6() {
        Random random = new Random();
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = random.nextInt();
        }
        int[] expect = Arrays.copyOf(nums, nums.length);
        getInstance().sort(nums);
        Arrays.sort(expect);
        Assertions.assertArrayEquals(expect, nums);
    }

}
