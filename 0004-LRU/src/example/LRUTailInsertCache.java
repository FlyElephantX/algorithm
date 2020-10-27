package example;

import java.util.HashMap;

class TailLinkedNode {
    int key;
    int val;
    TailLinkedNode prev;
    TailLinkedNode next;

    public TailLinkedNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

// 尾部插入数据，头部删除数据，最新的数据在队尾
public class LRUTailInsertCache {

    private HashMap<Integer, TailLinkedNode> hashMap;
    private TailLinkedNode head;
    private TailLinkedNode tail;
    private int capacity;
    private int size;

    public LRUTailInsertCache(Integer capacity) {
        this.hashMap = new HashMap<>(capacity);
        this.head = new TailLinkedNode(0, 0);
        this.tail = new TailLinkedNode(0, 0);
        this.capacity = capacity;
        this.head.next = tail;
        this.tail.prev = this.head;
    }

    public void put(Integer key, Integer val) {
        TailLinkedNode node = get(key);
        if (node != null) {
            moveToTail(node);
        } else {
            if (size == capacity) {
                removeHead();
                size--;
            }
            TailLinkedNode newNode = new TailLinkedNode(key, val);
            moveToTail(newNode);
            size++;
        }
    }

    public TailLinkedNode get(Integer key) {
        TailLinkedNode node = hashMap.get(key);
        return node;
    }

    private void moveToTail(TailLinkedNode node) {
        TailLinkedNode last = this.tail.prev;
        last.next = node;
        node.prev = last;
        node.next = this.tail;
        this.tail.prev = node;
    }

    private void removeHead() {
        TailLinkedNode first = this.head.next;
        this.head.next = first.next;
        first.next.prev = this.head;
    }

    public void printLinkList() {
        TailLinkedNode node = head.next;
        while (node != null && node.val != 0) {
            System.out.print("  " + node.val);
            node = node.next;
        }
        System.out.println();
    }
}
