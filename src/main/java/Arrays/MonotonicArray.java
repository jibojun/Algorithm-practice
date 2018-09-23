package Arrays;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/24_12:47 AM
 */
public class MonotonicArray {
    /**
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     * <p>
     * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
     * <p>
     * Return true if and only if the given array A is monotonic.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [1,2,2,3]
     * Output: true
     * Example 2:
     * <p>
     * Input: [6,5,4,4]
     * Output: true
     * Example 3:
     * <p>
     * Input: [1,3,2]
     * Output: false
     * Example 4:
     * <p>
     * Input: [1,2,4,5]
     * Output: true
     * Example 5:
     * <p>
     * Input: [1,1,1]
     * Output: true
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 50000
     * -100000 <= A[i] <= 100000
     *
     * @param A
     * @return
     */
    public boolean isMonotonic(int[] A) {
        if (A.length <= 1) {
            return true;
        }
        Boolean isIncrease = null;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                if (isIncrease == null) {
                    isIncrease = true;
                } else if (!isIncrease) {
                    return false;
                }
            } else if (A[i] > A[i + 1]) {
                if (isIncrease == null) {
                    isIncrease = false;
                } else if (isIncrease) {
                    return false;
                }
            }
        }
        return true;
    }
}
