package Arrays;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-21 15:42
 * @Description:
 */
public class SortArrayByParity {

    /**
     * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
     * <p>
     * You may return any answer array that satisfies this condition.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [3,1,2,4]
     * Output: [2,4,3,1]
     * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 5000
     * 0 <= A[i] <= 5000
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity(int[] A) {
        int low = 0;
        int high = A.length - 1;
        while (low < high) {
            if (A[low] % 2 != 0 && A[high] % 2 == 0) {
                int tmp = A[low];
                A[low] = A[high];
                A[high] = tmp;
                low++;
                high--;
            } else if (A[high] % 2 != 0) {
                high--;
            } else if (A[low] % 2 == 0) {
                low++;
            }
        }
        return A;
    }
}
