package net.wenzuo.codes.algorithm.sort;

/**
 * @author Catch
 * @since 2022-06-22
 */
class SelectionSortTest extends AbstractSortTest {

    @Override
    AbstractSort getSort() {
        return new SelectionSort();
    }

}