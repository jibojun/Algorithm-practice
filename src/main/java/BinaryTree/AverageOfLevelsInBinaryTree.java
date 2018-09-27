package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-27 16:40
 * @Description:
 */
public class AverageOfLevelsInBinaryTree {
    /**
     * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
     * Example 1:
     * Input:
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * Output: [3, 14.5, 11]
     * Explanation:
     * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
     * Note:
     * The range of node's value is in the range of 32-bit signed integer.
     *
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                sum += t.val;
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            resultList.add(sum / size);
        }
        return resultList;
    }
}
