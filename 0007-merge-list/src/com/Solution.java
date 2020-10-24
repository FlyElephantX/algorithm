package com;

public class Solution {

    public static void printNodeList(Node head) {
        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Node node1 = new Node(1);
////        Node node2 = new Node(3);
////        Node node3 = new Node(5);
////        node1.next = node2;
////        node2.next = node3;
////        Node n1 = new Node(2);
////        Node n2 = new Node(4);
////        Node n3 = new Node(6);
////        n1.next = n2;
////        n2.next = n3;
////        Merge merge = new Merge();
////        Node head = merge.mergeTwoSortedNode2(node1, n1);
//        while (head != null) {
//            System.out.println(" " + head.val);
//            head = head.next;
//        }
////        Node n11 = new Node(10);
////        Node n21 = new Node(10);
////        Node n32 = new Node(9);
////        n11.next = n21;
////        n21.next = n32;
////        boolean res = merge.isNodeListAsc(n11);
////        if (res) {
////            System.out.println("升序");
////        } else {
////            System.out.println("降序");
////        }

        Merge merge = new Merge();
//        Node node1 = new Node(1);
//        Node node2 = new Node(3);
//        Node node3 = new Node(5);
//        node1.next = node2;
//        node2.next = node3;
//        Node res1 = merge.mergeTwoSortedNode(node1, null, true);
//        printNodeList(res1);
//        Node res2 = merge.mergeTwoSortedNode(node1, null, false);
//        printNodeList(res2);
//        Node res3 = merge.mergeTwoSortedNode(null, node1, true);
//        printNodeList(res3);
//        Node res4 = merge.mergeTwoSortedNode(null, node1, false);
//        printNodeList(res4);

//        1.a 升序  b 升序
//        Node node1 = new Node(1);
//        Node node2 = new Node(3);
//        Node node3 = new Node(5);
//        node1.next = node2;
//        node2.next = node3;
//        Node n1 = new Node(2);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.next = n2;
//        n2.next = n3;
//        Node res1 = merge.mergeTwoSortedNode(node1, n1, true);
//        printNodeList(res1);
//        Node res2 = merge.mergeTwoSortedNode(node1, n1, false);
//        printNodeList(res2);

//        2.a 升序 b降序
//        Node node1 = new Node(1);
//        Node node2 = new Node(3);
//        Node node3 = new Node(5);
//        node1.next = node2;
//        node2.next = node3;
//        Node n1 = new Node(6);
//        Node n2 = new Node(4);
//        Node n3 = new Node(2);
//        n1.next = n2;
//        n2.next = n3;
//        Node res1 = merge.mergeTwoSortedNode(node1, n1, true);
//        printNodeList(res1);
//        Node res2 = merge.mergeTwoSortedNode(node1, n1, false);
//        printNodeList(res2);

//        3.a 降序 b升序
//        Node node1 = new Node(10);
//        Node node2 = new Node(5);
//        Node node3 = new Node(3);
//        Node node4 = new Node(1);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        Node n1 = new Node(2);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.next = n2;
//        n2.next = n3;
//        Node res1 = merge.mergeTwoSortedNode(node1, n1, true);
//        printNodeList(res1);
//        Node res2 = merge.mergeTwoSortedNode(node1, n1, false);
//        printNodeList(res2);

//        4.a 降序 b 降序
//        Node node1 = new Node(10);
//        Node node2 = new Node(5);
//        Node node3 = new Node(3);
//        Node node4 = new Node(1);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        Node n1 = new Node(6);
//        Node n2 = new Node(4);
//        Node n3 = new Node(2);
//        n1.next = n2;
//        n2.next = n3;
//        Node res1 = merge.mergeTwoSortedNode(node1, n1, true);
//        printNodeList(res1);
//        Node res2 = merge.mergeTwoSortedNode(node1, n1, false);
//        printNodeList(res2);

    }
}
