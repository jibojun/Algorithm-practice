package Arrays;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/23_2:52 AM
 */
public class TransposeMatrix {

    /**
     * Given a matrix A, return the transpose of A.
     * <p>
     * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[1,4,7],[2,5,8],[3,6,9]]
     * Example 2:
     * <p>
     * Input: [[1,2,3],[4,5,6]]
     * Output: [[1,4],[2,5],[3,6]]
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 1000
     * 1 <= A[0].length <= 1000
     *
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
