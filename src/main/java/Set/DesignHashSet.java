package Set;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/29_12:06 AM
 */
public class DesignHashSet {
    private Map<Integer, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public DesignHashSet() {
        map = new HashMap<>();
    }

    public void add(int key) {
        map.put(key, 0);
    }

    public void remove(int key) {
        map.remove(key);
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}
