package String;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-20 16:36
 * @Description:
 */
public class ReverseString {

    /**
     * Write a function that takes a string as input and returns the string reversed.
     * <p>
     * Example 1:
     * <p>
     * Input: "hello"
     * Output: "olleh"
     * Example 2:
     * <p>
     * Input: "A man, a plan, a canal: Panama"
     * Output: "amanaP :lanac a ,nalp a ,nam A"
     *
     * @param s
     * @return
     */
    public static String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        int low = 0;
        int high = chars.length - 1;
        while (low < high) {
            char tmp = s.charAt(low);
            chars[low] = chars[high];
            chars[high] = tmp;
            low++;
            high--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
