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

package net.wenzuo.codes.leetcode.No15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Catch
 * @since 2022-04-26
 */
class No15Test {

    private final No15 no15 = new No15();

    @Test
    void threeSum1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = no15.threeSum(nums);
        List<List<Integer>> expect = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        Assertions.assertTrue(equals(expect, result));
    }

    @Test
    void threeSum2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> result = no15.threeSum(nums);
        List<List<Integer>> expect = Arrays.asList();
        Assertions.assertTrue(equals(expect, result));
    }

    @Test
    void threeSum3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> result = no15.threeSum(nums);
        List<List<Integer>> expect = Arrays.asList(Arrays.asList(0, 0, 0));
        Assertions.assertTrue(equals(expect, result));
    }

    private boolean equals(List<List<Integer>> expect, List<List<Integer>> result) {
        if (expect == result) {
            return true;
        }
        if (expect == null || result == null) {
            return false;
        }
        if (expect.size() != result.size()) {
            return false;
        }
        for (int i = 0; i < expect.size(); i++) {
            List<Integer> list1 = expect.get(i);
            List<Integer> list2 = result.get(i);
            if (list1 == list2) {
                continue;
            }
            if (list1 == null || list2 == null) {
                return false;
            }
            if (list1.size() != list2.size()) {
                return false;
            }
            for (int j = 0; j < list1.size(); j++) {
                Integer i1 = list1.get(j);
                Integer i2 = list2.get(j);
                if (!Objects.equals(i1, i2)) {
                    return false;
                }
            }
        }
        return true;
    }

}
