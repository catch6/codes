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

package linearlist.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-20
 */
class SinglyLinkedListTest {

    SinglyLinkedList<Integer> list;

    @BeforeEach
    void beforeEach() {
        list = new SinglyLinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    @Test
    void add() {
        Assertions.assertEquals(100, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(99, list.getLast());
        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(i, list.get(i));
        }
    }

    @Test
    void add2() {
        list = new SinglyLinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i, i);
        }
        Assertions.assertEquals(100, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(99, list.getLast());
        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(i, list.get(i));
        }
    }

    @Test
    void addFirst() {
        list.addFirst(100);
        Assertions.assertEquals(101, list.size());
        Assertions.assertEquals(100, list.getFirst());
        Assertions.assertEquals(99, list.getLast());
        Assertions.assertEquals(100, list.get(0));
        for (int i = 1; i < 101; i++) {
            Assertions.assertEquals(i - 1, list.get(i));
        }
        list = new SinglyLinkedList<>();
        list.addFirst(0);
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(0, list.getLast());
        Assertions.assertEquals(0, list.get(0));
    }

    @Test
    void addLast() {
        list.addLast(100);
        Assertions.assertEquals(101, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(100, list.getLast());
        for (int i = 0; i < 101; i++) {
            Assertions.assertEquals(i, list.get(i));
        }
        list = new SinglyLinkedList<>();
        list.addLast(0);
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(0, list.getLast());
        Assertions.assertEquals(0, list.get(0));
    }

    @Test
    void remove() {
        list.remove(0);
        Assertions.assertEquals(99, list.size());
        Assertions.assertEquals(1, list.getFirst());
        Assertions.assertEquals(99, list.getLast());
        for (int i = 0; i < 99; i++) {
            Assertions.assertEquals(i + 1, list.get(i));
        }
    }

    @Test
    void remove2() {
        // 删除最后一个元素
        list.remove(99);
        Assertions.assertEquals(99, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(98, list.getLast());
        for (int i = 0; i < 99; i++) {
            Assertions.assertEquals(i, list.get(i));
        }
    }

    @Test
    void get() {
        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(i, list.get(i));
        }
    }

    @Test
    void size() {
        Assertions.assertEquals(100, list.size());
    }

    @Test
    void getFirst() {
        Assertions.assertEquals(0, list.getFirst());
    }

    @Test
    void getLast() {
        Assertions.assertEquals(99, list.getLast());
    }

    @Test
    void indexOf() {
        Assertions.assertEquals(-1, list.indexOf(100));
        Assertions.assertEquals(-1, list.indexOf(-1));
        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(i, list.indexOf(i));
        }
    }

}
