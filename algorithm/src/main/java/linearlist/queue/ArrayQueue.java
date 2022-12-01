package linearlist.queue;

/**
 * @author Catch
 * @since 2022-04-29
 */
public class ArrayQueue<E> implements Queue<E> {

    private Object[] data;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("初始容量需大于 0, initialCapacity=" + initialCapacity);
        }
        this.data = new Object[initialCapacity];
    }

    @Override
    public boolean enqueue(E element) {
        // 队列满了
        if (tail == data.length) {
            // 没有空闲位置可搬运，入队失败
            if (head == 0) {
                return false;
            }
            // 有空闲位置，进行一次搬运
            System.arraycopy(data, head, data, 0, tail - head);
            // 搬运后处理 head 和 tail 的新值
            tail = tail - head;
            head = 0;
        }
        // 队列不满
        data[tail++] = element;
        size++;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E dequeue() {
        // 队列空了
        if (head == data.length) {
            return null;
        }
        size--;
        return (E) data[head++];
    }

    @Override
    public int size() {
        return size;
    }

}
