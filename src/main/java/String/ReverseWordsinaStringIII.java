package String;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-20 19:42
 * @Description:
 */
public class ReverseWordsinaStringIII {

    /**
     * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     * <p>
     * Example 1:
     * Input: "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] stringArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            char[] chars = stringArray[i].toCharArray();
            int low = 0;
            int high = chars.length - 1;
            while (low < high) {
                char tmp = chars[low];
                chars[low] = chars[high];
                chars[high] = tmp;
                low++;
                high--;
            }
            if (i == stringArray.length - 1) {
                sb.append(new String(chars));
            } else {
                sb.append(String.format("%s ", new String(chars)));
            }
        }
        return new String(sb);
    }
}
