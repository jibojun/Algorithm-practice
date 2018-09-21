package Hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/22_1:52 AM
 */
public class JewelsAndStones {
    /**
     * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
     * <p>
     * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
     * <p>
     * Example 1:
     * <p>
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * Example 2:
     * <p>
     * Input: J = "z", S = "ZZ"
     * Output: 0
     * Note:
     * <p>
     * S and J will consist of letters and have length at most 50.
     * The characters in J are distinct.
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        for (char item : S.toCharArray()) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                map.put(item, map.get(item) + 1);
            }
        }
        int result = 0;
        for (char item : J.toCharArray()) {
            if (map.containsKey(item)) {
                result += map.get(item);
            }
        }
        return result;
    }
}
