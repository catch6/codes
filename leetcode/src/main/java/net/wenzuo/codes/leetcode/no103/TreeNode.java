package net.wenzuo.codes.leetcode.no103;

/**
 * @author Catch
 * @since 2023-03-12
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {this.val = val;}

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
