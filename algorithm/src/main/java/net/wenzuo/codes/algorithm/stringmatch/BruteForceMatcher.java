package net.wenzuo.codes.algorithm.stringmatch;

/**
 * BruteForce 暴力匹配算法
 * 暴力匹配算法的基本思想是在文本串中逐个枚举模式串的字符，看是否能匹配成功。
 * 具体实现可以使用两层循环，一层用来枚举文本串中的字符，另一层用来枚举模式串中的字符。
 * 如果模式串中的字符和文本串中对应的字符不匹配，就退出循环，否则继续匹配。
 * 如果在文本串的某个位置成功匹配了模式串，就返回这个位置。
 * 否则，如果扫描完了文本串也没有匹配成功，就返回 -1。
 *
 * @author Catch
 * @since 2022-12-24
 */
public class BruteForceMatcher implements Matcher {

    @Override
    public int indexOf(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i < n - m + 1; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

}
