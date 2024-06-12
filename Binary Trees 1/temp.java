import java.util.LinkedList;
import java.util.Queue;

public class temp {
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
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            //base
            if (nodes[idx] == -1) {
                return null;
            }
            Node root = new Node(nodes[idx]);
            Node left = buildTree(nodes);
            Node right = buildTree(nodes);

            return root;
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.println(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }



    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
//        System.out.println("Preorder traversal: ");
//        BinaryTree.preorder(root);
//        System.out.println();
//
//        System.out.println("Inorder traversal: ");
//        BinaryTree.inorder(root);
//        System.out.println();
//
//        System.out.println("Postorder traversal: ");
//        BinaryTree.postorder(root);
//        System.out.println();
//
        System.out.println("Levelorder Traversal: ");
        BinaryTree.levelorder(root);
//
//        System.out.println("Height of tree is: " + BinaryTree.getHieght(root));
//
//        System.out.println("Total nodes in tree are: " + BinaryTree.getCount(root));
//
//        System.out.println("Sum of the nodes in tree are: " + BinaryTree.getSum(root));
    }
}