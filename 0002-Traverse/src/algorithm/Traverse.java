package algorithm;

public class Traverse {

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node2, node3);
        TreeOrder treeOrder = new TreeOrder();
        treeOrder.preOrder(node1);
        treeOrder.inOrder(node1);
        treeOrder.postOrder(node1);
        treeOrder.levelOrder(node1);
    }
}
