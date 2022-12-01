package net.wenzuo.codes.algorithm.linearlist.queue;

import net.wenzuo.codes.algorithm.linearlist.queue.LinkedQueue;
import net.wenzuo.codes.algorithm.linearlist.queue.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-05-02
 */
class LinkedQueueTest {

    Queue<Integer> queue;

    @BeforeEach
    void reset() {
        queue = new LinkedQueue<>();
    }

    @Test
    void enqueue() {
        for (int i = 0; i < 10; i++) {
            boolean isOk = queue.enqueue(i);
            Assertions.assertTrue(isOk);
        }
        Assertions.assertEquals(10, queue.size());
    }

    @Test
    void dequeue() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 10; i++) {
            Integer value = queue.dequeue();
            Assertions.assertEquals(i, value);
        }
    }

    @Test
    void size() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        Assertions.assertEquals(10, queue.size());
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
        }
        Assertions.assertEquals(0, queue.size());
    }

}
