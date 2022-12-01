package sort;

/**
 * @author Catch
 * @since 2022-06-20
 */
class InsertionSortTest implements SortTest{

    @Override
    public Sort getInstance() {
        return new InsertionSort();
    }
}