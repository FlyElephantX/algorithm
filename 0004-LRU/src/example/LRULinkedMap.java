package example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedMap<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRULinkedMap(int capacity) {
        super(16, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > capacity;
    }
}
