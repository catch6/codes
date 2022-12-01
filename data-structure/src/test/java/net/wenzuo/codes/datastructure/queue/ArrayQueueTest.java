package net.wenzuo.codes.datastructure.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-29
 */
class ArrayQueueTest {

    private Queue<Integer> queue;

    @BeforeEach
    void reset() {
        queue = new ArrayQueue<>(10);
    }

    @Test
    void enqueue() {
        for (int i = 0; i < 20; i++) {
            boolean isOk = queue.enqueue(i);
            Assertions.assertEquals(i < 10, isOk);
        }
        // 释放 5 个位置
        for (int i = 0; i < 5; i++) {
            Integer value = queue.dequeue();
            Assertions.assertEquals(i, value);
        }
        // 队列满有位置，触发搬运
        for (int i = 10; i < 20; i++) {
            boolean isOk = queue.enqueue(i);
            Assertions.assertEquals(i < 15, isOk);
        }
    }

    @Test
    void dequeue() {
        for (int i = 0; i < 10; i++) {
            boolean isOk = queue.enqueue(i);
            Assertions.assertTrue(isOk);
            Integer value = queue.dequeue();
            Assertions.assertEquals(i, value);
        }
        Integer value = queue.dequeue();
        Assertions.assertNull(value);
    }

    @Test
    void size() {
        for (int i = 0; i < 10; i++) {
            boolean isOk = queue.enqueue(i);
            Assertions.assertTrue(isOk);
            Assertions.assertEquals(i + 1, queue.size());
        }
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
            Assertions.assertEquals(9 - i, queue.size());
        }
    }

}
