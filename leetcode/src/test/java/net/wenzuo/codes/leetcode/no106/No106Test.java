package net.wenzuo.codes.leetcode.no106;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-11-16
 */
class No106Test {

    private final No106 no106 = new No106();

    @Test
    void buildTree1() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode treeNode = no106.buildTree(inorder, postorder);
        TreeNode expected = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Assertions.assertEquals(expected, treeNode);
    }

    @Test
    void buildTree2() {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode treeNode2 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(8)));
    }
    //
    // private String toString(TreeNode treeNode) {
    //
    // }

}