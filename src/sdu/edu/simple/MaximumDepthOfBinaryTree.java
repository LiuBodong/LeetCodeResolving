package sdu.edu.simple;

// https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node2.left = node3;
        node2.right = node4;
        root.left = node1;
        root.right = node2;
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    public int depth(TreeNode node, int h) {
        if (node == null) {
            return h;
        } else {
            int l = depth(node.left, h + 1);
            int r = depth(node.right, h + 1);
            return Math.max(l, r);
        }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
