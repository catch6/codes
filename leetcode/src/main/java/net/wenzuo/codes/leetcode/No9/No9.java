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

package net.wenzuo.codes.leetcode.No9;

/**
 * 9. 回文数
 * https://leetcode.cn/problems/palindrome-number/
 *
 * @author Catch
 * @since 2022-04-29
 */
public class No9 {

    public boolean isPalindrome(int x) {
        // 负数或末位是 0 都不可能是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        // 每次取出 x 的末位放到 y 的末位，直到 x<=y
        int y = 0;
        while (x > y) {
            y = y * 10 + (x % 10);
            x = x / 10;
        }
        // 如果入参 x 是奇数的话，y 就会比 x 多一位，所以要去掉 y 的末位
        return x == y || x == y / 10;
    }

}
