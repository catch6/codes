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

package linearlist.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-27
 */
class LinkedStackTest {

    Stack<Integer> stack;

    @BeforeEach
    void beforeEach() {
        stack = new LinkedStack<>();
    }

    @Test
    void push() {
        boolean isOk;
        for (int i = 0; i < 100; i++) {
            isOk = stack.push(i);
            Assertions.assertTrue(isOk);
            Assertions.assertEquals(i + 1, stack.size());
            Assertions.assertEquals(i, stack.peek());
        }
    }

    @Test
    void pop() {
        Integer pop = stack.pop();
        Assertions.assertNull(pop);
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 100; i++) {
            pop = stack.pop();
            Assertions.assertEquals(99 - i, pop);
        }
        pop = stack.pop();
        Assertions.assertNull(pop);
    }

    @Test
    void peek() {
        for (int i = 0; i < 100; i++) {
            stack.push(i);
            Assertions.assertEquals(i, stack.peek());
        }
    }

    @Test
    void size() {
        for (int i = 0; i < 100; i++) {
            stack.push(i);
            Assertions.assertEquals(i + 1, stack.size());
        }
    }

}
