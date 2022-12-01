package net.wenzuo.codes.datastructure.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-21
 */
class DoubleLinkedListTest {

    LinkedList<Integer> list;

    @BeforeEach
    void reset() {
        list = new DoubleLinkedList<>();
    }

    @Test
    void add() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
            Assertions.assertEquals(i, list.get(i));
            Assertions.assertEquals(i + 1, list.size());
            Assertions.assertEquals(0, list.getFirst());
            Assertions.assertEquals(i, list.getLast());
            Assertions.assertEquals(i, list.indexOf(i));
        }
    }

    @Test
    void add2() {
        for (int i = 0; i < 100; i++) {
            list.add(i, i);
            Assertions.assertEquals(i, list.get(i));
            Assertions.assertEquals(i + 1, list.size());
            Assertions.assertEquals(0, list.getFirst());
            Assertions.assertEquals(i, list.getLast());
            Assertions.assertEquals(i, list.indexOf(i));
        }
    }

    @Test
    void addFirst() {
        for (int i = 0; i < 100; i++) {
            list.addFirst(i);
            Assertions.assertEquals(i, list.get(0));
            Assertions.assertEquals(0, list.get(i));
            Assertions.assertEquals(i + 1, list.size());
            Assertions.assertEquals(i, list.getFirst());
            Assertions.assertEquals(0, list.getLast());
            Assertions.assertEquals(0, list.indexOf(i));
        }
    }

    @Test
    void addLast() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
            Assertions.assertEquals(0, list.get(0));
            Assertions.assertEquals(i, list.get(i));
            Assertions.assertEquals(i + 1, list.size());
            Assertions.assertEquals(0, list.getFirst());
            Assertions.assertEquals(i, list.getLast());
            Assertions.assertEquals(i, list.indexOf(i));
        }
    }

    @Test
    void remove() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
        }
        list.remove(Integer.valueOf(0));
        Assertions.assertEquals(99, list.size());
        Assertions.assertEquals(1, list.getFirst());
        Assertions.assertEquals(99, list.getLast());
        for (int i = 0; i < 99; i++) {
            Assertions.assertEquals(i + 1, list.get(i));
            Assertions.assertEquals(i, list.indexOf(i + 1));
        }
    }

    @Test
    void remove2() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
        }
        list.remove(Integer.valueOf(99));
        Assertions.assertEquals(99, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(98, list.getLast());
        for (int i = 0; i < 99; i++) {
            Assertions.assertEquals(i, list.get(i));
            Assertions.assertEquals(i, list.indexOf(i));
        }
    }

    @Test
    void remove3() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
        }
        list.remove(0);
        Assertions.assertEquals(99, list.size());
        Assertions.assertEquals(1, list.getFirst());
        Assertions.assertEquals(99, list.getLast());
        for (int i = 0; i < 99; i++) {
            Assertions.assertEquals(i + 1, list.get(i));
            Assertions.assertEquals(i, list.indexOf(i + 1));
        }
    }

    @Test
    void remove4() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
        }
        list.remove(99);
        Assertions.assertEquals(99, list.size());
        Assertions.assertEquals(0, list.getFirst());
        Assertions.assertEquals(98, list.getLast());
        for (int i = 0; i < 99; i++) {
            Assertions.assertEquals(i, list.get(i));
            Assertions.assertEquals(i, list.indexOf(i));
        }
    }

    @Test
    void set() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
            list.set(i, 99 - i);
            Assertions.assertEquals(99 - i, list.get(i));
            Assertions.assertEquals(i + 1, list.size());
            Assertions.assertEquals(99, list.getFirst());
            Assertions.assertEquals(99 - i, list.getLast());
            Assertions.assertEquals(i, list.indexOf(99 - i));
        }
    }

    @Test
    void get() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
            Assertions.assertEquals(i, list.get(i));
        }
    }

    @Test
    void getFirst() {
        for (int i = 0; i < 100; i++) {
            list.addFirst(i);
            Assertions.assertEquals(i, list.getFirst());
        }

    }

    @Test
    void getLast() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
            Assertions.assertEquals(i, list.getLast());
        }
    }

    @Test
    void indexOf() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
            Assertions.assertEquals(i, list.indexOf(i));
        }
    }

    @Test
    void size() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
            Assertions.assertEquals(i + 1, list.size());
        }
    }

    @Test
    void reverse() {
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
        }
        list.reverse();
        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(99 - i, list.get(i));
            Assertions.assertEquals(99 - i, list.indexOf(i));
        }
        Assertions.assertEquals(100, list.size());
        Assertions.assertEquals(99, list.getFirst());
        Assertions.assertEquals(0, list.getLast());
    }

}
