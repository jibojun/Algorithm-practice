package String;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-20 17:08
 * @Description:
 */
public class LongestUncommonSubsequenceI {
    /**
     * Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.
     * <p>
     * A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.
     * <p>
     * The input will be two strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.
     * <p>
     * Example 1:
     * Input: "aba", "cdc"
     * Output: 3
     * Explanation: The longest uncommon subsequence is "aba" (or "cdc"),
     * because "aba" is a subsequence of "aba",
     * but not a subsequence of any other strings in the group of two strings.
     * Note:
     * <p>
     * Both strings' lengths will not exceed 100.
     * Only letters from a ~ z will appear in input strings.
     *
     * @param a
     * @param b
     * @return
     */
    public int findLUSlength(String a, String b) {
        //两个相同，则互为子序列，没有，返回-1
        if (a.equals(b)) {
            return -1;
        }
        //不同情况下，只需要返回长度长的
        return a.length() > b.length() ? a.length() : b.length();
    }
}
