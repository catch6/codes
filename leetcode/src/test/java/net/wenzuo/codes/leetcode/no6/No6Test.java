package net.wenzuo.codes.leetcode.no6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-05-05
 */
class No6Test {

    private final No6 no6 = new No6();

    @Test
    void convert1() {
        String result = no6.convert("PAYPALISHIRING", 3);
        Assertions.assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void convert2() {
        String result = no6.convert("PAYPALISHIRING", 4);
        Assertions.assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void convert3() {
        String result = no6.convert("A", 1);
        Assertions.assertEquals("A", result);
    }

}