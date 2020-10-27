package example;

public class Solution {

    public static void main(String[] args) {
//        LRUCache cache = new LRUCache(3);
//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.put(3, 3);
//        cache.printQueue();
//        cache.put(4, 4);
//        cache.printQueue();
//        cache.put(3, 3);
//        cache.put(5, 5);
//        cache.put(6, 6);
//        cache.printQueue();

        System.out.println("-----系统默认实现-----");
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

        System.out.println("-----头部数据最新-----");
        LRUHeadInsertCache headCache = new LRUHeadInsertCache(3);
        headCache.put(1, 1);
        headCache.put(2, 2);
        headCache.put(3, 3);
        headCache.printLinkList();
        headCache.put(4, 4);
        headCache.printLinkList();
        headCache.put(3, 3);
        headCache.put(5, 5);
        headCache.put(6, 6);
        headCache.printLinkList();

        System.out.println("-----尾部数据最新-----");
        LRUTailInsertCache tailCache = new LRUTailInsertCache(3);
        tailCache.put(1, 1);
        tailCache.put(2, 2);
        tailCache.put(3, 3);
        tailCache.printLinkList();
        tailCache.put(4, 4);
        tailCache.printLinkList();
        tailCache.put(3, 3);
        tailCache.put(5, 5);
        tailCache.put(6, 6);
        tailCache.printLinkList();

    }
}
