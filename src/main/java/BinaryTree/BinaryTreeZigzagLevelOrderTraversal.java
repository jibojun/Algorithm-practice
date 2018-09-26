package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/25_10:23 PM
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    /**
     * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
     * <p>
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its zigzag level order traversal as:
     * [
     * [3],
     * [20,9],
     * [15,7]
     * ]
     *
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    TreeNode t = stack1.pop();
                    list.add(t.val);
                    if (t.left != null)
                        stack2.push(t.left);
                    if (t.right != null)
                        stack2.push(t.right);
                }
            } else {
                while (!stack2.isEmpty()) {
                    TreeNode t = stack2.pop();
                    list.add(t.val);
                    if (t.right != null)
                        stack1.push(t.right);
                    if (t.left != null)
                        stack1.push(t.left);
                }
            }
            result.add(list);
        }
        return result;
    }
}
