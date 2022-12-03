package net.wenzuo.codes.datastructure.array;

/**
 * 数组容器
 *
 * @author Catch
 * @since 2022-12-02
 */
public interface ArrayList<E> {

    /**
     * 获取实际元素的个数
     *
     * @return 实际元素的个数
     */
    int size();

    /**
     * 将容器转换成数组
     *
     * @return 数组
     */
    Object[] toArray();

    /**
     * 向数组尾部添加元素
     *
     * @param element 添加的元素
     */
    void add(E element);

    /**
     * 向指定索引位置添加元素
     *
     * @param index   指定的索引位置
     * @param element 添加的元素
     */
    void add(int index, E element);

    /**
     * 删除指定索引位置的元素
     *
     * @param index 要删除的索引位置
     */
    void remove(int index);

    /**
     * 删除指定元素
     *
     * @param element 删除的元素
     * @return 删除的元素个数
     */
    int remove(E element);

    /**
     * 更新指定索引位置的元素
     *
     * @param index   指定的索引位置
     * @param element 新元素
     * @return 更新前的元素
     */
    E set(int index, E element);

    /**
     * 获取指定索引位置的元素
     *
     * @param index 指定的索引位置
     * @return 指定索引位置的元素
     */
    E get(int index);

    /**
     * 指定的元素在容器中首次出现的索引位置，没有出现则返回 -1
     *
     * @param element 指定的元素
     * @return 首次出现的索引位置，没有出现则返回 -1
     */
    int indexOf(E element);

    /**
     * 指定的元素在容器中最后一次出现的索引位置，没有出现则返回 -1
     *
     * @param element 指定的元素
     * @return 最后一次出现的索引位置，没有出现则返回 -1
     */
    int lastIndexOf(E element);

    /**
     * 清空数组
     */
    void clear();

}