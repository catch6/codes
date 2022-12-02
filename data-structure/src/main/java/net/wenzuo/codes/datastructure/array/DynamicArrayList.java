package net.wenzuo.codes.datastructure.array;

import java.util.Arrays;

/**
 * 支持动态扩容的数组容器
 *
 * @author Catch
 * @since 2022-04-19
 */
public class DynamicArrayList<E> implements ArrayList<E> {

    // 元素数组
    private Object[] elements;
    // 实际存放的元素数
    private int size = 0;

    private static final Object[] EMPTY = {};

    private static final int DEFAULT_CAPACITY = 10;

    public DynamicArrayList() {
        this.elements = EMPTY;
    }

    /**
     * @param initialCapacity 初始数组容量，需大于等于 0
     */
    public DynamicArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            elements = EMPTY;
        } else {
            throw new IllegalArgumentException("capacity 必须大于等于 0");
        }
    }

    public DynamicArrayList(ArrayList<E> arrayList) {
        Object[] array = arrayList.toArray();
        if (array.length != 0) {
            elements = Arrays.copyOf(array, array.length);
        } else {
            elements = EMPTY;
        }
        size = array.length;
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    /**
     * 添加元素，容量不足时会扩容为 1.5 倍
     *
     * @param element 添加的元素
     */
    public void add(E element) {
        // 确保容量足够，容量不足时进行扩容
        ensureCapacity();
        elements[size++] = element;
    }

    /**
     * 指定位置增加元素
     *
     * @param index   下标位置
     * @param element 元素
     */
    public void add(int index, E element) {
        // 确保容量足够，容量不足时进行扩容
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    /**
     * 删除元素
     *
     * @param index 要删除元素的下标索引
     */
    public void remove(int index) {
        checkIndex(index);
        // 要删除的元素后面的元素往前移动一位
        size--;
        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[size] = null;
    }

    @Override
    public int remove(E element) {
        int count = 0, ptr = 0;
        Object[] newElements = new Object[size];
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    count++;
                } else {
                    newElements[ptr++] = elements[i];
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    count++;
                } else {
                    newElements[ptr++] = elements[i];
                }
            }
        }
        elements = newElements;
        size = ptr;
        return count;
    }

    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        checkIndex(index);
        E old = (E) elements[index];
        elements[index] = element;
        return old;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (element.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(E element) {
        if (element == null) {
            for (int i = elements.length - 1; i > -1; i--) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = elements.length - 1; i > -1; i--) {
                if (element.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        elements = EMPTY;
        size = 0;
    }

    /**
     * 检查下标是否在合理范围
     *
     * @param index 下标
     */
    private void checkIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("下标应大于等于 0");
        }
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标越界 index: " + index + ", size: " + size);
        }
    }

    /**
     * 确保容量足够
     */
    private void ensureCapacity() {
        // 容量不够
        if (size >= elements.length) {
            // 计算新容量
            int newCapacity;
            if (elements == EMPTY) {
                newCapacity = DEFAULT_CAPACITY;
            } else {
                newCapacity = elements.length + (elements.length >> 1);
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public String toString() {
        return "ArrayList{" +
            "elements=" + Arrays.toString(elements) +
            ", capacity=" + elements.length +
            ", size=" + size +
            '}';
    }

}
