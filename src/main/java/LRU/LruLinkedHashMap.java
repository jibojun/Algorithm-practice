package LRU;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/10/13_4:16 PM
 */
public class LruLinkedHashMap<K, V> {
    private Map<K, V> cacheMap;

    @SuppressWarnings("unchecked")
    public LruLinkedHashMap(int cacheSize) {
        cacheMap = new LinkedHashMap((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return this.size() > cacheSize;
            }
        };
    }

    public void putCache(K key, V value) {
        this.cacheMap.put(key, value);
    }

    public V getCache(K key) {
        return this.cacheMap.get(key);
    }

    public Collection<Map.Entry<K, V>> getAll() {
        return new ArrayList<>(cacheMap.entrySet());
    }


    public static void main(String[] args) {
        LruLinkedHashMap<String, Integer> map = new LruLinkedHashMap<>(3);
        map.putCache("key1", 1);
        map.putCache("key2", 2);
        map.putCache("key3", 3);

        for (Map.Entry<String, Integer> e : map.getAll()) {
            System.out.println(e.getKey() + "====>" + e.getValue());
        }
        System.out.println("\n");
        map.putCache("key4", 4);
        for (Map.Entry<String, Integer> e : map.getAll()) {
            System.out.println(e.getKey() + "====>" + e.getValue());
        }

    }
}
