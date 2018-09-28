package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-28 10:44
 * @Description:
 */
public class PathSumII {
    private List<List<Integer>> resultList = new ArrayList<>();
    private List<Integer> tmplist = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return resultList;
        }
        tmplist.add(root.val);
        if (root.left == null && root.right == null && sum - root.val == 0) {
            resultList.add(new ArrayList<>(tmplist));
        }
        pathSum(root.left, sum - root.val);
        pathSum(root.right, sum - root.val);
        tmplist.remove(tmplist.size() - 1);
        return resultList;
    }
}
