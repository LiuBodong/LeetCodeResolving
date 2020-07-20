package sdu.edu.simple;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {

    public static List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        } else {
            if (root.children != null) {
                for (Node child : root.children) {
                    list.addAll(postorder(child));
                }
            }
            list.add(root.val);
        }
        return list;
    }


    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
