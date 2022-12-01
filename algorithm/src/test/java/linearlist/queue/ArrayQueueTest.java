/*
 * MIT License
 *
 * Copyright (c) 2022 Catch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package linearlist.queue;

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
        // 释放5个位置
        for (int i = 0; i < 5; i++) {
            Integer value = queue.dequeue();
            Assertions.assertEquals(i, value);
        }
        // 队列满有位置,触发搬运
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
