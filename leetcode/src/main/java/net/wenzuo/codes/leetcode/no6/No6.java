package net.wenzuo.codes.leetcode.no6;

import java.util.Arrays;

/**
 * 6. Z 字形变换
 * https://leetcode.cn/problems/zigzag-conversion/
 *
 * @author Catch
 * @since 2022-05-03
 */
class No6 {

    String convert(String s, int numRows) {
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