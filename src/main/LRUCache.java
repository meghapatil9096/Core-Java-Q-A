package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
//        return super.removeEldestEntry(eldest);
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> map = new LRUCache<>(3);
        map.put("mongo",88);
        map.put("CSS",69);
        map.put("java",87);
        map.put("javascript",86);

        System.out.println(map);

    }
}
