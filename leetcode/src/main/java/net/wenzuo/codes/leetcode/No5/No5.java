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

package net.wenzuo.codes.leetcode.No5;

/**
 * 5. 最长回文子串
 * https://leetcode.cn/problems/longest-palindromic-substring/
 *
 * @author Catch
 * @since 2022-04-29
 */
public class No5 {

    // 回文串一定是对称的，所以我们可以每次循环选择一个中心，
    // 进行左右扩展，判断左右字符是否相等即可
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            // 奇数回文串的情况
            int len1 = expandAround(s, i, i);
            // 偶数回文串的情况
            int len2 = expandAround(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > (end - start + 1)) {
                // 右移一位相当于除以 2
                start = i - ((len - 1) >> 1);
                end = i + (len >> 1);
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAround(String s, int left, int right) {
        int l = left;
        int r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        // 要减一是因为最后多执行了一次--和++
        return r - l - 1;
    }

}
