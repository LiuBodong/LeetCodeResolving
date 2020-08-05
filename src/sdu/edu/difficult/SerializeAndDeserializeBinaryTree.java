package sdu.edu.difficult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeAndDeserializeBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        node2.left = node3;
        node2.right = node4;
        Codec codec = new Codec();
        String s = codec.serialize(root);
        System.out.println(s);
    }

    public static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            serialize(root, sb);
            return sb.toString();
        }

        public void serialize(TreeNode node, StringBuilder sb) {
            if (node == null) {
                sb.append(",");
            } else {
                sb.append(node.val).append(",");
                serialize(node.left, sb);
                serialize(node.right, sb);
            }
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            return deserialize(new ArrayList<>(Arrays.asList(data.split(","))));
        }

        public TreeNode deserialize(List<String> list) {
            if (list.get(0).isEmpty()) {
                list.remove(0);
                return null;
            }
            TreeNode node = new TreeNode(Integer.parseInt(list.remove(0)));
            node.left = deserialize(list);
            node.right = deserialize(list);
            return node;
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
