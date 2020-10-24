package com;

import java.util.LinkedList;
import java.util.Queue;

public class Construct {

    public TreeNode createTree(char[] data) {
        if (data.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = data[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 0;
        while (!queue.isEmpty() && i < data.length / 2) {
            TreeNode top = queue.poll();
            if (2 * i + 1 < data.length) {
                TreeNode left = new TreeNode();
                left.val = data[2 * i + 1];
                top.left = left;
                queue.add(left);
            }
            if (2 * i + 2 <data.length) {
                TreeNode right = new TreeNode();
                right.val = data[2 * i + 2];
                top.right = right;
                queue.add(right);
            }
            i++;
        }
        return root;
    }
}
