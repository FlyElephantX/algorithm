package com;

public class Merge {

    // targetNodeIsDesc: true, 代表目标链表降序，false则是正序
    public Node mergeTwoSortedNode(Node a, Node b, Boolean targetNodeIsDesc) {
        if (a == null && b == null) {
            return null;
        }
        if (a == null) {
            boolean isAsc = isNodeListAsc(b);
            if (targetNodeIsDesc == isAsc) { // 降序
                b = reverseList(b);
            }
            return b;
        }
        if (b == null) {
            boolean isAsc = isNodeListAsc(a);
            if (targetNodeIsDesc == isAsc) { // 降序
                a = reverseList(a);
            }
            return a;
        }
        boolean aIsAsc = isNodeListAsc(a);
        boolean bIsAsc = isNodeListAsc(b);
        Node res = null;
        if (targetNodeIsDesc) { // 降序
            if (aIsAsc && bIsAsc) { // 升序
                res = mergeTwoAscdNodeList(a, b);
                res = reverseList(res);
            } else if (aIsAsc && !bIsAsc) {
                a = reverseList(a);
                res = mergeTwoDescdNodeList(a, b);
            } else if (!aIsAsc && bIsAsc) {
                b = reverseList(b);
                res = mergeTwoDescdNodeList(a, b);
            } else {
                res = mergeTwoDescdNodeList(a, b);
            }
        } else { // 正序
            if (aIsAsc && bIsAsc) { // 升序
                res = mergeTwoAscdNodeList(a, b);
            } else if (aIsAsc && !bIsAsc) {
                b = reverseList(b);
                res = mergeTwoAscdNodeList(a, b);
            } else if (!aIsAsc && bIsAsc) {
                a = reverseList(a);
                res = mergeTwoAscdNodeList(a, b);
            } else {
                res = mergeTwoDescdNodeList(a, b);
                res = reverseList(res);
            }
        }
        return res;
    }

    public Node mergeTwoAscdNodeList(Node a, Node b) { // 升序链表合并
        Node head = new Node(-1);
        Node tail = head;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a != null) {
            tail.next = a;
        }
        if (b != null) {
            tail.next = b;
        }
        return head.next;
    }

    public Node mergeTwoDescdNodeList(Node a, Node b) { // 降序链表合并
        Node head = new Node(-1);
        Node tail = head;
        while (a != null && b != null) {
            if (a.val >= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a != null) {
            tail.next = a;
        }
        if (b != null) {
            tail.next = b;
        }
        return head.next;
    }

    public Node mergeTwoSortedNode2(Node a, Node b) {
        Node head = null;
        Node tail = null;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                if (head == null) {
                    head = a;
                    tail = head;
                } else {
                    tail.next = a;
                    tail = tail.next;
                }
                a = a.next;
            } else {
                if (head == null) {
                    head = b;
                    tail = head;
                } else {
                    tail.next = b;
                    tail = tail.next;
                }
                b = b.next;
            }
        }
        if (a != null) {
            tail.next = a;
        }
        if (b != null) {
            tail.next = b;
        }
        return head;
    }

    public boolean isNodeListAsc(Node head) { // 是否升序
        if (head == null || head.next == null) {
            return true;
        }
        while (head != null && head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        if (head.val < head.next.val) {
            return true;
        } else {
            return false;
        }
    }


    public Node reverseList(Node head) {
        Node pre = null;
        while (head != null) {
            Node tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
}
