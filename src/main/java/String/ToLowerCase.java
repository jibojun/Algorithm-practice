package String;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-20 17:25
 * @Description:
 */
public class ToLowerCase {
    /**
     * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: "Hello"
     * Output: "hello"
     * Example 2:
     * <p>
     * Input: "here"
     * Output: "here"
     * Example 3:
     * <p>
     * Input: "LOVELY"
     * Output: "lovely"
     *
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
