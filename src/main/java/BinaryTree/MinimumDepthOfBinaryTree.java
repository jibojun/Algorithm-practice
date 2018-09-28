package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-28 15:39
 * @Description:
 */
public class MinimumDepthOfBinaryTree {

    /**
     * Given a binary tree, find its minimum depth.
     * <p>
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     * <p>
     * Note: A leaf is a node with no children.
     * <p>
     * Example:
     * <p>
     * Given binary tree [3,9,20,null,null,15,7],
     * <p>
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its minimum depth = 2.
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int dep = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                if (t.left == null && t.right == null) {
                    found = true;
                    break;
                }
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            dep++;
            if (found) {
                break;
            }
        }
        return dep;
    }
}
