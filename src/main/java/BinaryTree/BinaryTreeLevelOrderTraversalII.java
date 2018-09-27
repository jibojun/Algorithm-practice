package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/28_12:06 AM
 */
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> tmpList = new ArrayList<>();
        if (root == null) {
            return tmpList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                list.add(t.val);
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            tmpList.add(list);
        }
        int low = 0;
        int high = tmpList.size() - 1;
        while (low < high) {
            List<Integer> tmp = tmpList.get(low);
            tmpList.set(low, tmpList.get(high));
            tmpList.set(high, tmp);
            low++;
            high--;
        }
        return tmpList;
    }
}
