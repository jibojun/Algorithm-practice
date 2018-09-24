package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/25_12:33 AM
 */
public class GroupsOfSpecialEquivalentStrings {
    /**
     * You are given an array A of strings.
     * <p>
     * Two strings S and T are special-equivalent if after any number of moves, S == T.
     * <p>
     * A move consists of choosing two indices i and j with i % 2 == j % 2, and swapping S[i] with S[j].
     * <p>
     * Now, a group of special-equivalent strings from A is a non-empty subset S of A such that any string not in S is not special-equivalent with any string in S.
     * <p>
     * Return the number of groups of special-equivalent strings from A.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: ["a","b","c","a","c","c"]
     * Output: 3
     * Explanation: 3 groups ["a","a"], ["b"], ["c","c","c"]
     * Example 2:
     * <p>
     * Input: ["aa","bb","ab","ba"]
     * Output: 4
     * Explanation: 4 groups ["aa"], ["bb"], ["ab"], ["ba"]
     * Example 3:
     * <p>
     * Input: ["abc","acb","bac","bca","cab","cba"]
     * Output: 3
     * Explanation: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
     * Example 4:
     * <p>
     * Input: ["abcd","cdab","adcb","cbad"]
     * Output: 1
     * Explanation: 1 group ["abcd","cdab","adcb","cbad"]
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 1000
     * 1 <= A[i].length <= 20
     * All A[i] have the same length.
     * All A[i] consist of only lowercase letters.
     *
     * @param A
     * @return
     */
    public int numSpecialEquivGroups(String[] A) {
        Set<Map<String, Integer>> set = new HashSet<>();
        for (String str : A) {
            set.add(countStr(str));
        }
        return set.size();
    }

    private Map<String, Integer> countStr(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i += 2) {
            if (map.containsKey("O@" + s.charAt(i))) {
                map.put("O@" + s.charAt(i), map.get("O@" + s.charAt(i)) + 1);
            } else {
                map.put("O@" + s.charAt(i), 1);
            }
        }
        for (int i = 1; i < s.length(); i += 2) {
            if (map.containsKey("E@" + s.charAt(i))) {
                map.put("E@" + s.charAt(i), map.get("E@" + s.charAt(i)) + 1);
            } else {
                map.put("E@" + s.charAt(i), 1);
            }
        }
        return map;
    }
}
