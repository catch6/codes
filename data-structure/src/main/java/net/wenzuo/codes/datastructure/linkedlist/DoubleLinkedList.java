package net.wenzuo.codes.datastructure.linkedlist;

import java.util.NoSuchElementException;

/**
 * 双向链表
 *
 * @author Catch
 * @since 2022-04-20
 */
public class DoubleLinkedList<E> implements LinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public DoubleLinkedList() {
    }

    @Override
    public void add(E element) {
        addLast(element);
    }

    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);
        if (index == size) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        Node<E> node = node(index);
        node.prev.next = new Node<>(node.prev, element, node);
        size++;
    }

    @Override
    public void addFirst(E element) {
        if (first == null) {
            first = new Node<>(null, element, null);
            last = first;
            size++;
            return;
        }
        first = new Node<>(null, element, first);
        first.next.prev = first;
        size++;
    }

    @Override
    public void addLast(E element) {
        if (last == null) {
            first = new Node<>(null, element, null);
            last = first;
            size++;
            return;
        }
        last.next = new Node<>(last, element, null);
        last = last.next;
        size++;
    }

    @Override
    public void remove(E element) {
        Node<E> node = node(element);
        if (node == null) {
            return;
        }
        if (node == last) {
            last = node.prev;
            size--;
            return;
        }
        if (node == first) {
            first = first.next;
            size--;
            return;
        }
        node.prev.next = node.next;
        size--;
    }

    @Override
    public void remove(int index) {
        checkElementIndex(index);
        Node<E> node = node(index);
        if (node == last) {
            last = node.prev;
        }
        if (node == first) {
            first = node.next;
        } else {
            node.prev.next = node.next;
        }
        size--;
    }

    @Override
    public void set(int index, E element) {
        checkElementIndex(index);
        Node<E> node = node(index);
        node.item = element;
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);
        Node<E> node = node(index);
        return node.item;
    }

    @Override
    public E getFirst() {
        if (size == 0) {
            throw new NoSuchElementException("不存在该元素");
        }
        return first.item;
    }

    @Override
    public E getLast() {
        if (size == 0) {
            throw new NoSuchElementException("不存在该元素");
        }
        return last.item;
    }

    @Override
    public int indexOf(E element) {
        Node<E> ptr = first;
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public void reverse() {
        Node<E> ptr = first;
        first = last;
        last = ptr;
        Node<E> tmp;
        while (ptr != null) {
            tmp = ptr.prev;
            ptr.prev = ptr.next;
            ptr.next = tmp;
            ptr = ptr.prev;
        }
    }

    @Override
    public boolean hasLoop() {
        // TODO
        return false;
    }

    private Node<E> node(int index) {
        // 可以优化前向查找还是后向查找
        if (index <= (size >> 1)) {
            Node<E> ptr = first;
            for (int i = 0; i < index; i++) {
                ptr = ptr.next;
            }
            return ptr;
        }
        Node<E> ptr = last;
        for (int i = size - 1; i > index; i--) {
            ptr = ptr.prev;
        }
        return ptr;
    }

    private Node<E> node(E element) {
        Node<E> ptr = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (ptr.item == null) {
                    return ptr;
                }
                ptr = ptr.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(ptr.item)) {
                    return ptr;
                }
                ptr = ptr.next;
            }
        }
        return null;
    }

    private void checkPositionIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("下标越界，index=" + index);
        }
        if (index > size) {
            throw new IndexOutOfBoundsException("下标越界，index=" + index + ", size=" + size);
        }
    }

    private void checkElementIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("下标越界，index=" + index);
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException("下标越界，index=" + index + ", size=" + size);
        }
    }

    /**
     * 节点
     *
     * @param <E>
     */
    private static class Node<E> {

        private Node<E> prev;
        private E item;
        private Node<E> next;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }

    }

}