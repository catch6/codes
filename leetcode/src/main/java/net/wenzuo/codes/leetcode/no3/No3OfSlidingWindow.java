package net.wenzuo.codes.leetcode.no3;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 *
 * @author Catch
 * @since 2023-03-09
 */
class No3OfSlidingWindow extends AbstractNo3 {

    @Override
    int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c)) {
                l = Math.max(l, map.get(c) + 1);
            }
            map.put(c, r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

}
