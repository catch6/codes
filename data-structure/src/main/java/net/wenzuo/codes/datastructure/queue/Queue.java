package net.wenzuo.codes.datastructure.queue;

/**
 * 队列
 *
 * @author Catch
 * @since 2022-04-29
 */
public interface Queue<E> {

    /**
     * 向队尾插入一个元素
     */
    boolean enqueue(E element);

    /**
     * 从队头取出一个元素
     */
    E dequeue();

    /**
     * 获取队列元素数量
     */
    int size();

}