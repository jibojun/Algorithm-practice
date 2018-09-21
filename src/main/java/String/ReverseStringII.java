package String;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-21 15:03
 * @Description:
 */
public class ReverseStringII {
    /**
     * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
     * Example:
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * Restrictions:
     * The string consists of lower English letters only.
     * Length of the given string and k will in the range [1, 10000]
     *
     * @param s
     * @param k
     * @return
     */
    public static String reverseStr(String s, int k) {
        if (s == null || s.length() == 0) {
            return s;
        }
        if (s.length() <= k) {
            return new StringBuilder(s).reverse().toString();
        }
        if (s.length() <= 2 * k) {
            return new StringBuilder(s.substring(0, k)).reverse().append(s.substring(k)).toString();
        }
        StringBuilder sb = new StringBuilder();
        while (s.length() > 2 * k) {
            sb.append(reverseStr(s.substring(0, 2 * k), k));
            s = s.substring(2 * k);
        }
        sb.append(reverseStr(s, k));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
