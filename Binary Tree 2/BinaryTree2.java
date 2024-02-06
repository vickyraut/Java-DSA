import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        public static int getHieght(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = getHieght(root.left);
            int rightHeight = getHieght(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        // BruteForce
        public static int getDiameter(Node root) { // TC: o(n2)
            // base case
            if (root == null) {
                return 0;
            }

            int leftDiameter = getDiameter(root.left);
            int rightDiameter = getDiameter(root.right);

            int leftHeight = getHieght(root.left);
            int rightHeight = getHieght(root.right);
            int selfDiameter = (leftHeight + rightHeight + 1);

            return Math.max(Math.max(leftDiameter, rightDiameter), selfDiameter);
        }

        static class Info {
            int diameter;
            int height;

            public Info(int diameter, int height) {
                this.diameter = diameter;
                this.height = height;
            }
        }

        // Optimised
        public static Info getDiameter2(Node root) { // TC: o(n)
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = getDiameter2(root.left);
            Info rightInfo = getDiameter2(root.right);

            int selfDiameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), (leftInfo.height + rightInfo.height + 1));
            int selfHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

            return new Info(selfDiameter, selfHeight);
        }

        public static boolean isIdentical(Node node, Node subroot) {
            if (node == null && subroot == null) {
                return true;
            } else if (node == null || subroot == null || node.data != subroot.data) {
                return false;
            }

            if (!isIdentical(node.left, subroot.left)) {
                return false;
            }

            if (!isIdentical(node.right, subroot.right)) {
                return false;
            }

            return true;
        }

        public static boolean isSubtree(Node root, Node subroot) { // TC: o(n)
            // base
            if (root == null) {
                return false;
            }

            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }

            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }

        static class Info2 {
            Node node;
            int hd;

            public Info2(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void TopViewTree(Node root) {
            Queue<Info2> queue = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            queue.add(new Info2(root, 0));
            queue.add(null);

            while (!queue.isEmpty()) {
                Info2 curr = queue.remove();
                if (curr == null) {
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) { // First time occurrence
                        map.put(curr.hd, curr.node);
                    }

                    if (curr.node.left != null) {
                        queue.add(new Info2(curr.node, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }

                    if (curr.node.right != null) {
                        queue.add(new Info2(curr.node, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data + " ");
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println("Diameter of given Tree is: " + BinaryTree.getDiameter(root));
        System.out.println("Diameter of given Tree is: " + BinaryTree.getDiameter2(root).diameter);

        System.out.println(BinaryTree.isSubtree(root, subroot));

        BinaryTree.TopViewTree(root);
    }
}
