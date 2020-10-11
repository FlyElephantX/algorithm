package example;

public class Solution {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.printQueue();
        cache.put(4, 4);
        cache.printQueue();
        cache.put(3, 3);
        cache.put(5, 5);
        cache.put(6, 6);
        cache.printQueue();

        LRULinkedMap<Integer, Integer> linkedMap = new LRULinkedMap<>(3);
        linkedMap.put(1, 1);
        linkedMap.put(2, 2);
        linkedMap.put(3, 3);
        System.out.println(linkedMap.keySet());
        linkedMap.put(4, 4);
        System.out.println(linkedMap.keySet());
        linkedMap.put(3, 3);
        linkedMap.put(5, 5);
        linkedMap.put(6, 6);
        System.out.println(linkedMap.keySet());
    }
}
