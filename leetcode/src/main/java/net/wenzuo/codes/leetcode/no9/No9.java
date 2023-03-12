package net.wenzuo.codes.leetcode.no9;

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