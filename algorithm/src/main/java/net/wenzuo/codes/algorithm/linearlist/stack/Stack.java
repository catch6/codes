package net.wenzuo.codes.algorithm.linearlist.stack;

/**
 * 栈
 *
 * @author Catch
 * @since 2022-04-27
 */
public interface Stack<E> {

    /**
     * 入栈，将元素放入栈的顶端
     */
    boolean push(E element);

    /**
     * 出栈，将顶端元素取出
     */
    E pop();

    /**
     * 查看顶端元素，与 pop() 的区别是本方法不会删除栈顶端元素
     */
    E peek();

    /**
     * 获取栈元素数量
     */
    int size();

}
