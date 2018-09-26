package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-26 19:31
 * @Description:
 */
public class NaryTreePreorderTraversal {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root != null) {
            list.add(root.val);
            for (Node node : root.children) {
                preorder(node);
            }
        }
        return list;
    }
}
