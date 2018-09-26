package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-26 19:37
 * @Description:
 */
public class NaryTreePostorderTraversal {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root != null) {
            for (Node node : root.children) {
                postorder(node);
            }
            list.add(root.val);
        }
        return list;
    }
}
