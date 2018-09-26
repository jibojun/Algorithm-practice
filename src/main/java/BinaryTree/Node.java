package BinaryTree;

import java.util.List;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-26 19:30
 * @Description:
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
