package linearlist.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-20
 */
class ArrayListTest {

    ArrayList<Integer> arr;

    @BeforeEach
    void beforeEach() {
        arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(i);
        }
    }

    @Test
    void constructor1() {
        arr = new ArrayList<>();
        Assertions.assertEquals(0, arr.size());
    }

    @Test
    void constructor2() {
        arr = new ArrayList<>(10);
        Assertions.assertEquals(0, arr.size());
    }

    @Test
    void constructor3() {
        arr = new ArrayList<>(arr);
        Assertions.assertEquals(100, arr.size());
    }

    @Test
    void add() {
        Assertions.assertEquals(100, arr.size());
    }

    @Test
    void add2() {
        arr.add(0, 100);
        Assertions.assertEquals(100, arr.get(0));
        Assertions.assertEquals(0, arr.get(1));
        Assertions.assertEquals(99, arr.get(100));
    }

    @Test
    void remove() {
        arr.remove(0);
        Assertions.assertEquals(99, arr.size());
        Assertions.assertEquals(1, arr.get(0));
    }

    @Test
    void get() {
        Assertions.assertEquals(0, arr.get(0));
        Assertions.assertEquals(99, arr.get(99));
    }

    @Test
    void indexOf() {
        Assertions.assertEquals(0, arr.indexOf(0));
        Assertions.assertEquals(99, arr.indexOf(99));
        Assertions.assertEquals(-1, arr.indexOf(100));
    }

    @Test
    void lastIndexOf() {
        Assertions.assertEquals(0, arr.indexOf(0));
        Assertions.assertEquals(50, arr.indexOf(50));
        Assertions.assertEquals(99, arr.indexOf(99));
    }

    @Test
    void size() {
        Assertions.assertEquals(100, arr.size());
    }

    @Test
    void toArray() {
        Object[] array = arr.toArray();
        Assertions.assertEquals(array.length, arr.size());
    }

    @Test
    void set() {
        Integer old0 = arr.set(0, 100);
        Integer old99 = arr.set(99, 100);
        Assertions.assertEquals(100, arr.get(0));
        Assertions.assertEquals(100, arr.get(99));
        Assertions.assertEquals(0, old0);
        Assertions.assertEquals(99, old99);
    }

    @Test
    void testToString() {
    }

}
