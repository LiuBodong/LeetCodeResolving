package sdu.edu.medium;

// https://leetcode-cn.com/problems/validate-binary-search-tree
public class ValidateBinarySearchTree {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        System.out.println(new ValidateBinarySearchTree().isValidBST(root));
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root);
    }

    public boolean isValid(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.right != null) {
            if (node.left.val < node.val && node.right.val >= node.val) {
                return (isValid(node.left) && isValid(node.right));
            } else {
                return false;
            }
        } else {
            return true;
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
