package net.wenzuo.codes.leetcode.no146;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2023-03-11
 */
class LRUCacheTest {

    @Test
    void test1() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        Assertions.assertEquals(1, lRUCache.get(1));    // 返回 1 缓存是 {2=2,1=1}
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        Assertions.assertEquals(-1, lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {3=3,4=4}
        Assertions.assertEquals(-1, lRUCache.get(1));    // 返回 -1 (未找到)
        Assertions.assertEquals(3, lRUCache.get(3));    // 返回 3 缓存是 {4=4,3=3}
        Assertions.assertEquals(4, lRUCache.get(4));    // 返回 4 缓存是 {3=3,4=4}
    }

}