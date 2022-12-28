package net.wenzuo.codes.algorithm.stringmatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-12-24
 */
abstract class AbstractMatcherTest {

    Matcher matcher;

    private void check(String text, String pattern) {
        int expected = text.indexOf(pattern);
        int actual = matcher.indexOf(text, pattern);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void indexOf1() {
        check("abcdadsdsds", "ads");
    }

    @Test
    void indexOf2() {
        check("abcdadsdsdsq", "sds");
    }

    @Test
    void indexOf3() {
        check("abcdadsdsdsw", "");
    }

    @Test
    void indexOf4() {
        check("abcdadsdsdse", "qwes");
    }

    @Test
    void indexOf5() {
        check("abccdadsdsds", "abc");
    }

}
