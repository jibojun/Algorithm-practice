package Arrays;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/23_2:32 AM
 */
public class FlippingAnImage {
    /**
     * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
     * <p>
     * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
     * <p>
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,1,0],[1,0,1],[0,0,0]]
     * Output: [[1,0,0],[0,1,0],[1,1,1]]
     * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
     * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     * Example 2:
     * <p>
     * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
     * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * Notes:
     * <p>
     * 1 <= A.length = A[0].length <= 20
     * 0 <= A[i][j] <= 1
     *
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            int low = 0;
            int high = A.length - 1;
            while (low <= high) {
                if (row[low] == row[high]) {
                    if (low == high) {
                        row[low] = switchZeroAndOne(row[low]);
                    } else {
                        row[low] = switchZeroAndOne(row[low]);
                        row[high] = switchZeroAndOne(row[high]);
                    }
                }
                low++;
                high--;
            }
        }
        return A;
    }

    private int switchZeroAndOne(int i) {
        if (i == 0) {
            return 1;
        } else if (i == 1) {
            return 0;
        } else {
            return i;
        }
    }

}
