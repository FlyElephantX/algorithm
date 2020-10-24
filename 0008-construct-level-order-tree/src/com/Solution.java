package com;

public class Solution {

    public static void main(String[] args) {
        String str = "ABCDEFGHK";
        Construct construct = new Construct();
        TreeNode node = construct.createTree(str.toCharArray());
        System.out.println("根节点的值:" + node.val);
    }
}
