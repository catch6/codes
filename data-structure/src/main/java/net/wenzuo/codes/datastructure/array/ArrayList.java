package net.wenzuo.codes.datastructure.array;

/**
 * 数组容器
 * @author Catch
 * @since 2022-12-02
 */
public interface ArrayList<E> {

    /**
     * 向数组尾部添加元素
     * @param element 添加的元素
     */
    void add(E element);

    /**
     * 向指定索引位置添加元素
     * @param index 指定的索引位置
     * @param element 添加的元素
     */
    void add(int index, E element);

    /**
     * 删除指定索引位置的元素
     * @param index 要删除的索引位置
     */
    void remove(int index);

    /**
     * 删除指定元素
     * @param element 删除的元素
     */
    void remove(E element);
}
