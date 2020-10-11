package example;

import java.util.HashMap;
import java.util.Map;

class DoubleQueueNode {
    int key;
    int val;
    DoubleQueueNode pre;
    DoubleQueueNode next;
    public DoubleQueueNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

public class LRUCache {

    private int size;
    private int capacity;
    private Map<Integer, DoubleQueueNode> hashMap;
    private DoubleQueueNode head;
    private DoubleQueueNode tail;

    public LRUCache(Integer capacity) {
        this.capacity = capacity;
        this.hashMap = new HashMap<>(capacity);
        this.head = new DoubleQueueNode(0, 0);
        this.tail = new DoubleQueueNode(0, 0);
        this.head.next = tail;
    }

    public Integer put(Integer key, Integer value) {
        Integer oldValue = null;
        DoubleQueueNode node = get(key);
        if (node == null) {
            eliminate();
            DoubleQueueNode newNode = new DoubleQueueNode(key, value);
            moveToHead(newNode);
            hashMap.put(key, newNode);
            size++;
        } else {
            oldValue = node.val;
            node.val = value;
        }
        return oldValue;
    }

    public void printQueue() {
        DoubleQueueNode node = head.next;
        while (node != null) {
            System.out.print("  " + node.val);
            node = node.next;
        }
        System.out.println();
    }

    private DoubleQueueNode get(Integer key) {
        DoubleQueueNode node = hashMap.get(key);
        if (node == null) {
            return null;
        }
        node.pre.next = node.next;
        node.next.pre = node.pre;
        moveToHead(node);
        return node;
    }

    private void moveToHead(DoubleQueueNode node) {
        DoubleQueueNode temp = head.next;
        head.next = node;
        node.next = temp;
        node.pre = head;
        temp.pre = node;
    }

    private void eliminate() {
        if (size < capacity) {
            return;
        }
        DoubleQueueNode last = tail.pre;
        remove(last.key);
        last.pre.next = tail;
        tail.pre = last.pre;
        size--;
        last = null;
    }

    private Integer remove(Integer key) {
        DoubleQueueNode delteNode = hashMap.get(key);
        if (delteNode == null) {
            return null;
        }
        delteNode.pre.next = delteNode.next;
        delteNode.next.pre = delteNode.pre;
        hashMap.remove(key);
        return delteNode.val;
    }

}
