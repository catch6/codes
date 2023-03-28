package net.wenzuo.codes.leetcode.no200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2023-03-13
 */
abstract class AbstractNo200Test {

    AbstractNo200 abstractNo200 = getAbstractNo200();

    abstract AbstractNo200 getAbstractNo200();

    @Test
    void numIslands1() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int actual = abstractNo200.numIslands(grid);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numIslands2() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int actual = abstractNo200.numIslands(grid);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

}