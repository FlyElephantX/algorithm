package example;

// 头部插入数据，尾部移除数据，最新的数据在头部

import java.util.HashMap;

class HeadLinkedNode {
    int key;
    int val;
    HeadLinkedNode prev;
    HeadLinkedNode next;

    public HeadLinkedNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

public class LRUHeadInsertCache {

    public HashMap<Integer, HeadLinkedNode> hashMap;
    private HeadLinkedNode head;
    private HeadLinkedNode tail;
    private int capacity;
    private int size;

    public LRUHeadInsertCache(int capacity) {
        this.capacity = capacity;
        this.hashMap = new HashMap<>(capacity);
        this.head = new HeadLinkedNode(0,0);
        this.tail = new HeadLinkedNode(0, 0);
        this.head.next = tail;
    }

    public void put(Integer key, Integer val) {
        HeadLinkedNode node = get(key);
        if (node != null) {
            moveToHead(node);
        } else {
            if (size == capacity) {
                removeLastNode();
                size--;
            }
            HeadLinkedNode newNode = new HeadLinkedNode(key, val);
            moveToHead(newNode);
            size++;
        }
    }

    public HeadLinkedNode get(Integer key) {
        HeadLinkedNode node = this.hashMap.get(key);
        return node;
    }

    private void moveToHead(HeadLinkedNode node) {
        HeadLinkedNode first = this.head.next;
        node.next = first;
        first.prev = node;
        this.head.next = node;
        node.prev = this.head;
    }

    private void removeLastNode() {
        HeadLinkedNode last = this.tail.prev;
        last.prev.next = this.tail;
        this.tail.prev = last.prev;
    }

    public void printLinkList() {
        HeadLinkedNode node = head.next;
        while (node != null && node.val != 0) {
            System.out.print("  " + node.val);
            node = node.next;
        }
        System.out.println();
    }

}
