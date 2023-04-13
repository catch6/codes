package net.wenzuo.codes.leetcode.no10;

/**
 * @author Catch
 * @since 2023-02-11
 */
class No10DynamicProgramming extends AbstractNo10 {

    @Override
    boolean isMatch(String s, String p) {
        int i = s.length() - 1, j = p.length() - 1;
        return doMatch(s, p, i, j);
    }

    private boolean doMatch(String s, String p, int i, int j) {
        // TODO
        return false;
    }

}
