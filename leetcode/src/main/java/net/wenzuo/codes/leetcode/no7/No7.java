package net.wenzuo.codes.leetcode.no7;

/**
 * 7. 整数反转
 * https://leetcode.cn/problems/reverse-integer/
 *
 * @author Catch
 * @since 2022-05-05
 */
class No7 {

    int reverse(int x) {
        int result = 0;
        while (x != 0) {
            // 校验是否即将溢出
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }

}