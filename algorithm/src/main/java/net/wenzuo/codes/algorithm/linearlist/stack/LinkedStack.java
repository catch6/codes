package net.wenzuo.codes.algorithm.linearlist.stack;

/**
 * @author Catch
 * @since 2022-04-27
 */
public class LinkedStack<E> implements Stack<E> {

    private Node<E> head;
    private int size;

    public LinkedStack() {
    }

    @Override
    public boolean push(E element) {
        head = new Node<>(element, head);
        size++;
        return true;
    }

    @Override
    public E pop() {
        if (head == null) {
            return null;
        }
        E element = head.element;
        head = head.next;
        size--;
        return element;
    }

    @Override
    public E peek() {
        return head == null ? null : head.element;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

    }

}
