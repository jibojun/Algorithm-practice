package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-25 11:31
 * @Description:
 */
public class ImplementStackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(x);
        } else if (!queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(x);
        } else {
            queue2.add(x);
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size - 1; i++) {
                queue2.add(queue1.remove());
            }
            return queue1.remove();
        } else {
            int size = queue2.size();
            for (int i = 0; i < size - 1; i++) {
                queue1.add(queue2.remove());
            }
            return queue2.remove();
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (!queue1.isEmpty()) {
            int tmp = pop();
            queue2.add(tmp);
            return tmp;
        } else {
            int tmp = pop();
            queue1.add(tmp);
            return tmp;
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
    }
}
