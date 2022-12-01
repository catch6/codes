package linearlist.linkedlist;

/**
 * 链表接口，定义要实现的功能点
 *
 * @author Catch
 * @since 2022-04-21
 */
public interface LinkedList<E> {

    /**
     * 向链表末尾添加一个元素，等同于 addLast(E element)
     */
    void add(E element);

    void add(int index, E element);

    void addFirst(E element);

    void addLast(E element);

    void remove(E element);

    void remove(int index);

    void set(int index, E element);

    E get(int index);

    E getFirst();

    E getLast();

    int indexOf(E element);

    /**
     * 返回链表的元素数
     */
    int size();

    /**
     * 反转链表
     */
    void reverse();

    /**
     * 链表是否有环 (循环)
     */
    boolean hasLoop();

}
