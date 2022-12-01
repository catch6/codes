package linearlist.queue;

/**
 * @author Catch
 * @since 2022-05-02
 */
public class LinkedQueue<E> implements Queue<E> {

    private Node<E> head;
    private Node<E> last;
    private int size = 0;

    @Override
    public boolean enqueue(E element) {
        if (last == null) {
            head = last = new Node<>(element, null);
            size++;
            return true;
        }
        last.next = new Node<>(element, null);
        last = last.next;
        size++;
        return true;
    }

    @Override
    public E dequeue() {
        if (head == null) {
            return null;
        }
        E element = head.element;
        head = head.next;
        size--;
        return element;
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
