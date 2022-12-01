package net.wenzuo.codes.datastructure.stack;

/**
 * @author Catch
 * @since 2022-04-27
 */
public class ArrayStack<E> implements Stack<E> {

    private Object[] data;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int capacity) {
        this.data = new Object[capacity];
    }

    @Override
    public boolean push(E element) {
        if (size == data.length) {
            return false;
        }
        data[size++] = element;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E pop() {
        if (size == 0) {
            return null;
        }
        return (E) data[--size];
    }

    @SuppressWarnings("unchecked")
    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return (E) data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

}
