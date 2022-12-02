package net.wenzuo.codes.datastructure.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author Catch
 * @since 2022-12-02
 */
abstract class AbstractArrayListTest {

    ArrayList<Integer> arrayList;

    @Test
    public void size1() {
        arrayList.clear();
        Assertions.assertEquals(0, arrayList.size());
    }

    @Test
    void size2() {
        arrayList.clear();
        fill(arrayList, 100);
        Assertions.assertEquals(100, arrayList.size());
    }

    @Test
    void toArray1() {
        arrayList.clear();
        Object[] elements = arrayList.toArray();
        Assertions.assertEquals(0, elements.length);
    }

    @Test
    void toArray2() {
        arrayList.clear();
        fill(arrayList, 100);
        Object[] elements = arrayList.toArray();
        Assertions.assertEquals(100, elements.length);
        boolean isSame = isSameElements(arrayList, elements);
        Assertions.assertTrue(isSame);
    }

    // TODO 其他方法单元测试

    private boolean isSameElements(ArrayList<Integer> arrayList, Object[] elements) {
        for (int i = 0; i < arrayList.size(); i++) {
            Integer element = arrayList.get(i);
            if ((element == null && elements[i] != null) || (element != null && !element.equals(elements[i]))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 随机填充 count 数量的元素
     */
    private void fill(ArrayList<Integer> arrayList, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arrayList.add(random.nextInt());
        }
    }

}
