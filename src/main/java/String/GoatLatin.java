package String;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/25_12:54 AM
 */
public class GoatLatin {
    /**
     * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
     * <p>
     * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
     * <p>
     * The rules of Goat Latin are as follows:
     * <p>
     * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
     * For example, the word 'apple' becomes 'applema'.
     * <p>
     * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
     * For example, the word "goat" becomes "oatgma".
     * <p>
     * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
     * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
     * Return the final sentence representing the conversion from S to Goat Latin.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: "I speak Goat Latin"
     * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
     * Example 2:
     * <p>
     * Input: "The quick brown fox jumped over the lazy dog"
     * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
     * <p>
     * <p>
     * Notes:
     * <p>
     * S contains only uppercase, lowercase and spaces. Exactly one space between each word.
     * 1 <= S.length <= 150.
     *
     * @param S
     * @return
     */
    public String toGoatLatin(String S) {
        if (S == null || S.length() == 0) {
            return S;
        }
        List<Character> vowels = new ArrayList<>();
        for (char c : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}) {
            vowels.add(c);
        }
        String[] strings = S.split(" ");
        String postfix = "ma";
        int count = 1;
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            StringBuilder sb = new StringBuilder(s);
            if (vowels.contains(s.charAt(0))) {
                sb.append(postfix);
            } else {
                sb.deleteCharAt(0).append(s.charAt(0)).append(postfix);
            }
            for (int i = 0; i < count; i++) {
                sb.append("a");
            }
            count++;
            result.append(sb.append(" "));
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}
