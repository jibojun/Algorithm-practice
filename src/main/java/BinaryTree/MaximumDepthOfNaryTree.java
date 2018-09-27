package BinaryTree;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-27 14:46
 * @Description:
 */
public class MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int dep = 0;
        for (Node child : root.children) {
            dep = Math.max(maxDepth(child), dep);
        }
        return dep + 1;
    }
}
