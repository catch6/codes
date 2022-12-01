package net.wenzuo.codes.datastructure.queue;

/**
 * @author Catch
 * @since 2022-05-02
 */
public class ArrayBlockingQueue<E> implements Queue<E> {

    @Override
    public boolean enqueue(E element) {
        return false;
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

}
