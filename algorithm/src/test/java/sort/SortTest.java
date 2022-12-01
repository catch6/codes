/*
 * MIT License
 *
 * Copyright (c) 2022 Catch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package sort;

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
