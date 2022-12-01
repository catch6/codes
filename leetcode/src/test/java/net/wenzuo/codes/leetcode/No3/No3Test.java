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
