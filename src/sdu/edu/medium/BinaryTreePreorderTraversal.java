package sdu.edu.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        if (root.left != null) {
            list.addAll(preorderTraversal(root.left));
        }
        if (root.right != null) {
            list.addAll(preorderTraversal(root.right));
        }
        return list;
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
