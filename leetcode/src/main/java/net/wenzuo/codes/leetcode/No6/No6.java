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

package net.wenzuo.codes.leetcode.No6;

import java.util.Arrays;

/**
 * 6. Z 字形变换
 * https://leetcode.cn/problems/zigzag-conversion/
 *
 * @author Catch
 * @since 2022-05-03
 */
public class No6 {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        String[] strArr = new String[numRows];
        Arrays.fill(strArr, "");
        int sign = -1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            strArr[index] += s.charAt(i);
            if (index == 0 || index == numRows - 1) {
                sign = -sign;
            }
            index += sign;
        }
        StringBuilder result = new StringBuilder();
        for (String str : strArr) {
            result.append(str);
        }
        return result.toString();
    }

}
