package net.wenzuo.codes.algorithm.stringmatch;

/**
 * Hash 算法的基本思想是将模式串和文本串的每个子串映射到一个数字上，
 * 然后比较这两个数字是否相等。这样可以大大减少比较的次数，提高匹配效率。
 *
 * @author Catch
 * @since 2022-12-27
 */
public class HashMatcher implements Matcher {

    @Override
    public int indexOf(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int pHash = hash(pattern);
        for (int i = 0; i < n - m + 1; i++) {
            String sub = text.substring(i, i + m);
            int tHash = hash(sub);
            if (tHash == pHash && sub.equals(pattern)) {
                return i;
            }
        }
        return -1;
    }

    public int hash(String str) {
        int h = 0;
        for (int i = 0; i < str.length(); i++) {
            /*
             * 将字符串中的每个字符减去 'a' 的原因是为了将字符转换为数字。
             * 在 Java 中，字符是用数字表示的，并且使用 ASCII 码表示字符。
             * 例如，字符 'a' 的 ASCII 码值为 97，字符 'b' 的 ASCII 码值为 98，以此类推。
             * 因此，将字符 'a' 减去 'a' 的值（即 97-97=0），可以将字符 'a' 转换为数字 0。
             * 同理，将字符 'b' 减去 'a' 的值（即 98-97=1），可以将字符 'b' 转换为数字 1。
             */
            h = 26 * h + str.charAt(i) - 'a';
        }
        return h;
    }

}
