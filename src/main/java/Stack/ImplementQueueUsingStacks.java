package Stack;

import java.util.Stack;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-25 14:39
 * @Description:
 */
public class ImplementQueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            stack1.push(x);
        } else if (!stack1.isEmpty() && stack2.isEmpty()) {
            stack1.push(x);
        } else {
            stack2.push(x);
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            int tmp = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return tmp;
        } else {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            int tmp = stack1.pop();
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return tmp;
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            int tmp = stack2.peek();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return tmp;
        } else {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            int tmp = stack1.peek();
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return tmp;
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
