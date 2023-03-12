package net.wenzuo.nowcoder.nc45;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Catch
 * @since 2023-03-10
 */
public class NC45Impl implements NC45 {

    @Override
    public int[][] threeOrders(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        preorder(root, pre);
        inorder(root, in);
        postorder(root, post);
        int[][] ret = new int[3][pre.size()];
        for (int i = 0; i < pre.size(); i++) {
            ret[0][i] = pre.get(i);
            ret[1][i] = in.get(i);
            ret[2][i] = post.get(i);
        }
        return ret;
    }

    private void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    private void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }

}
