package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-27 13:37
 * @Description:
 */
public class NaryTreeLevelOrderTraversal {


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();
                list.add(n.val);
                for (Node child : n.children) {
                    queue.offer(child);
                }
            }
            resultList.add(list);
        }
        return resultList;
    }
}
