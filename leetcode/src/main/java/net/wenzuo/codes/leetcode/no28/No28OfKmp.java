package net.wenzuo.codes.leetcode.no28;

/**
 * @author Catch
 * @since 2023-04-13
 */
class No28OfKmp extends AbstractNo28 {

    @Override
    int strStr(String haystack, String needle) {
        int[] next = new int[needle.length()];
        int len = 0;
        int i = 1;
        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                next[i] = len;
                i++;
                continue;
            }
            if (len > 0) {
                len = next[len - 1];
                continue;
            }
            next[i] = 0;
            i++;
        }

        i = 0;
        int j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return i - j;
            }
            if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j > 0) {
                    j = next[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

}
