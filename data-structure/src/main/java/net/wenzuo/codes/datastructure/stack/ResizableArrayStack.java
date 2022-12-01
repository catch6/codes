package net.wenzuo.codes.datastructure.stack;

import java.util.Arrays;

/**
 * @author Catch
 * @since 2022-04-27
 */
public class ResizableArrayStack<E> implements Stack<E> {

    private Object[] data;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY = {};

    public ResizableArrayStack() {
        this.data = EMPTY;
    }

    public ResizableArrayStack(int initialCapacity) {
        if (initialCapacity > 0) {
            this.data = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.data = EMPTY;
        } else {
            throw new IllegalArgumentException("初始容量错误，initialCapacity=" + initialCapacity);
        }
    }

    @Override
    public boolean push(E element) {
        ensureCapacity(size);
        this.data[size++] = element;
        return true;
    }

    private void ensureCapacity(int newSize) {
        if (this.data == EMPTY) {
            this.data = new Object[DEFAULT_CAPACITY];
        } else {
            if (newSize >= data.length) {
                int newCapacity = data.length + (data.length >> 1);
                this.data = Arrays.copyOf(this.data, newCapacity);
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E pop() {
        if (size == 0) {
            return null;
        }
        return (E) this.data[--size];
    }

    @SuppressWarnings("unchecked")
    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return (E) this.data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

}
