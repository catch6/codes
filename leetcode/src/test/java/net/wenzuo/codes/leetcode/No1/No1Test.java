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

package net.wenzuo.codes.leetcode.No1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Catch
 * @since 2022-04-26
 */
class No1Test {

    private final No1 no1 = new No1();

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
