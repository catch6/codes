package net.wenzuo.codes.datastructure.stack;

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
