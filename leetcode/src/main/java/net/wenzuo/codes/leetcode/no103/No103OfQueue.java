package net.wenzuo.codes.leetcode.no103;

import java.util.*;

/**
 * @author Catch
 * @since 2023-03-12
 */
class No103OfQueue extends AbstractNo103 {

    @Override
    List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isOdd = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> levelList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (isOdd) {
                    levelList.offerLast(node.val);
                } else {
                    levelList.offerFirst(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(new ArrayList<>(levelList));
            isOdd = !isOdd;
        }
        return res;
    }

}
