package net.wenzuo.codes.algorithm.sort;

/**
 * @author Catch
 * @since 2022-06-20
 */
class InsertionSortTest extends AbstractSortTest {

    @Override
    AbstractSort getSort() {
        return new InsertionSort();
    }

}