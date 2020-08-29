package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeOrder {

    /*
        先序遍历
     */
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        System.out.print("先序遍历:");
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            System.out.print(" " + top.val);
            if (top.right != null) {
                stack.push(top.right);
            }
            if (top.left != null) {
                stack.push(top.left);
            }
        }
        System.out.println();
    }

    /*
        中序遍历
    */
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        System.out.print("中序遍历:");
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                TreeNode top = stack.pop();
                System.out.print(" " + top.val);
                p = top.right;
            }
        }
        System.out.println();
    }

    /*
        后序遍历
    */
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode top = stack1.pop();
            stack2.push(top);
            if (top.left != null) {
                stack1.push(top.left);
            }
            if (top.right != null) {
                stack1.push(top.right);
            }
        }
        System.out.print("后续遍历:");
        while (!stack2.isEmpty()) {
            TreeNode top = stack2.pop();
            System.out.print(" " + top.val);
        }
        System.out.println();
    }

    /*
        层次遍历
    */
    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.print("层次遍历:");
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            System.out.print(" " + top.val);
            if (top.left != null) {
                queue.add(top.left);
            }
            if (top.right != null) {
                queue.add(top.right);
            }
        }
    }
}
