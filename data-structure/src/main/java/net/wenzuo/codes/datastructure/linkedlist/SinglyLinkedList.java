package net.wenzuo.codes.datastructure.linkedlist;

/**
 * 单链表
 * 在头结点加入了哨兵，用以消除对头节点是否为 null 的判断，提高效率
 *
 * @author Catch
 * @since 2022-04-20
 */
public class SinglyLinkedList<E> implements LinkedList<E> {

    // 头结点
    private Node<E> head = new Node<>(null, null);
    // 尾结点方便 addLast
    private Node<E> last = head;
    // 实际存储的元素数
    private int size;

    public SinglyLinkedList() {
    }

    /**
     * 新增元素
     */
    @Override
    public void add(E element) {
        addLast(element);
    }

    /**
     * 指定位置新增元素
     */
    @Override
    public void add(int index, E element) {
        size++;
        checkIndex(index);
        Node<E> ptr = head;
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        ptr.next = new Node<>(element, ptr.next);
        last = last.next;
    }

    /**
     * 在最前面新增元素
     */
    @Override
    public void addFirst(E element) {
        head.next = new Node<>(element, head.next);
        if (last == head) {
            last = head.next;
        }
        size++;
    }

    /**
     * 在最后面新增元素
     */
    @Override
    public void addLast(E element) {
        last.next = new Node<>(element, null);
        last = last.next;
        size++;
    }

    @Override
    public void remove(E element) {

    }

    /**
     * 删除指定位置的元素
     */
    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<E> ptr = head;
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        size--;
        last = node(size - 1);
    }

    @Override
    public void set(int index, E element) {

    }

    /**
     * 删除指定元素
     */

    /**
     * 修改指定位置的元素
     */
    private Node<E> node(int index) {
        Node<E> ptr = head.next;
        // 这里 for 循环只是为了让指针往后走，所以只需要遍历到 index
        // 当遍历结束意味着 i==index
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        return ptr;
    }

    /**
     * 获取指定位置的元素
     */
    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
    }

    /**
     * 获取第一个元素
     */
    @Override
    public E getFirst() {
        return head.next == null ? null : head.next.item;
    }

    /**
     * 获取最后一个元素
     */
    @Override
    public E getLast() {
        return last == head ? null : last.item;
    }

    /**
     * 查询元素
     */
    @Override
    public int indexOf(E element) {
        Node<E> ptr = head.next;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (ptr.item == null) {
                    return i;
                }
                ptr = ptr.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(ptr.item)) {
                    return i;
                }
                ptr = ptr.next;
            }
        }
        return -1;
    }

    /**
     * 获取元素个数
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public void reverse() {
        Node<E> dummy = head;
        Node<E> prev = head;
        Node<E> curr = prev.next;
        while (curr != null) {
            Node<E> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        dummy.next.next = null;
        dummy.next = prev;
        head = dummy;
    }

    @Override
    public boolean hasLoop() {
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("下标越界，index=" + index);
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException("下标越界，index=" + index + ", size=" + size);
        }
    }

    /**
     * 节点
     */
    private static class Node<E> {

        private E item;
        private Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }

    }

}