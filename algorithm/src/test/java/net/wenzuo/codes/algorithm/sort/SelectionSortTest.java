package net.wenzuo.codes.algorithm.sort;

/**
 * @author Catch
 * @since 2022-06-22
 */
class SelectionSortTest implements SortTest {

    @Override
    public Sort getInstance() {
        return new SelectionSort();
    }

}
