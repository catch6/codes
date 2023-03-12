package net.wenzuo.codes.leetcode.no3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Catch
 * @since 2023-03-09
 */
public class No3BySlidingWindow implements No3 {

    @Override
    public int lengthOfLongestSubstring(String s) {
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
