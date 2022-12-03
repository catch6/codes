package net.wenzuo.codes.leetcode.No3;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 *
 * @author Catch
 * @since 2022-04-26
 */
public class No3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        int l = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                // 之所以取最大值是防止指针倒退，如 tmmzuxt，在遍历最后一个 t 时避免 l 倒退为 1
                l = Math.max(l, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - l + 1);
        }
        return max;
    }

}