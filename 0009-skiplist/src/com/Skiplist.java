package com;

import java.util.Random;

class ListNode {
    int val;
    int count; // 出现的次数
    int level;
    ListNode[] nexts;

    public ListNode(int val, int level) {
        this.val = val;
        this.count = 1;
        this.level = level;
        this.nexts = new ListNode[level];
    }
}

public class Skiplist {

    private static float PROBABILITY = 0.5f;
    private static int MAX_LEVEL = 32;
    private ListNode head;
    private Random random;
    private int level = 0;

    public Skiplist() {
        this.head = new ListNode(Integer.MIN_VALUE, MAX_LEVEL);
        this.random = new Random();
    }

    public boolean search(int target) {
        ListNode node = head;
        for (int i = MAX_LEVEL - 1; i >= 0; i--) {
            while (node.nexts[i] != null && node.nexts[i].val < target) {
                node = node.nexts[i];
            }
        }
        node = node.nexts[0];
        if (node == null) {
            return false;
        }
        return node.val == target;
    }

    public void add(int num) {
        // 记录每层能访问的最右节点
        ListNode[] prev = new ListNode[MAX_LEVEL];
        ListNode node = head;
        for (int i = MAX_LEVEL - 1; i >= 0; i--) {
            while (node.nexts[i] != null && node.nexts[i].val < num) {
                node = node.nexts[i];
            }
            prev[i] = node;
        }
        node = node.nexts[0];
        if (node != null && node.val == num) {
            node.count++;
        } else {
            ListNode newNode = createNode(num);
            for (int i = newNode.level - 1; i >= 0; i--) {
                ListNode pre = prev[i];
                // 假设当前存在节点的层级为a，新节点的层级为b
                // b < a 正常交换
                // b = a 正常交换
                // b > a b > a 最差的情况可以由head指向
                newNode.nexts[i] = pre.nexts[i]; // 这里难道不会溢出吗？
                pre.nexts[i] = newNode;
            }
        }
    }

    public boolean erase(int num) {
        ListNode[] prev = new ListNode[MAX_LEVEL];
        ListNode node = head;
        for (int i = MAX_LEVEL - 1; i >= 0; i--) {
            while (node.nexts[i] != null && node.nexts[i].val < num) {
                node = node.nexts[i];
            }
            prev[i] = node;
        }
        node = node.nexts[0];
        if (node == null || node.val != num) {
            return false;
        }
        if (node.count > 1) {
            node.count = node.count - 1;
        } else {
            for (int i = node.level - 1; i >= 0; i--) {
                prev[i].nexts[i] = node.nexts[i];
            }
        }
        return true;
    }

    private ListNode createNode(int val) {
        int level = randomLevel();
        ListNode node = new ListNode(val, level);
        return node;
    }

    private int randomLevel() {
        int level = 1;
        while (Math.random() < PROBABILITY && level < MAX_LEVEL) level++;
        return level;
    }
}
