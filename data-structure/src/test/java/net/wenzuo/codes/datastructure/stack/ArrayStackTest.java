package net.wenzuo.codes.datastructure.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-27
 */
class ArrayStackTest {

    Stack<Integer> stack;

    @BeforeEach
    void beforeEach() {
        stack = new ArrayStack<>(10);
    }

    @Test
    void push() {
        boolean isOk;
        for (int i = 0; i < 10; i++) {
            isOk = stack.push(i);
            Assertions.assertTrue(isOk);
            Assertions.assertEquals(i + 1, stack.size());
            Assertions.assertEquals(i, stack.peek());
        }
        isOk = stack.push(10);
        Assertions.assertFalse(isOk);
    }

    @Test
    void pop() {
        Integer pop = stack.pop();
        Assertions.assertNull(pop);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            pop = stack.pop();
            Assertions.assertEquals(9 - i, pop);
        }
        pop = stack.pop();
        Assertions.assertNull(pop);
    }

    @Test
    void peek() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            Assertions.assertEquals(i, stack.peek());
        }
    }

    @Test
    void size() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            Assertions.assertEquals(i + 1, stack.size());
        }
    }

}
