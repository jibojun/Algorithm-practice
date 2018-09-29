package TopKth;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-29 15:37
 * @Description:
 */
public class KthLargestElementInAnArray {

    /**
     * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * <p>
     * Example 1:
     * <p>
     * Input: [3,2,1,5,6,4] and k = 2
     * Output: 5
     * Example 2:
     * <p>
     * Input: [3,2,3,1,2,4,5,5,6] and k = 4
     * Output: 4
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ array's length.
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int i : nums) {
            if (heap.size() < k) {
                heap.offer(i);
            } else if (heap.peek() < i) {
                heap.poll();
                heap.offer(i);
            }
        }
        return heap.poll();
    }
}
