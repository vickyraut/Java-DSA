import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBasics {
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

            // Create current Node
            Node newNode = new Node(nodes[idx]);
            // left Node
            newNode.left = buildTree(nodes);
            // right Node
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node currNode) {
            if (currNode == null) {
                return;
            }
            System.out.print(currNode.data + " ");
            preorder(currNode.left);
            preorder(currNode.right);
        }

        public static void inorder(Node currNode) {
            if (currNode == null) {
                return;
            }
            inorder(currNode.left);
            System.out.print(currNode.data + " ");
            inorder(currNode.right);
        }

        public static void postorder(Node currNode) {
            if (currNode == null) {
                return;
            }
            postorder(currNode.left);
            postorder(currNode.right);
            System.out.print(currNode.data + " ");
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            // Adding first level
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
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }

        public static int getHieght(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = getHieght(root.left);
            int rightHeight = getHieght(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int getCount(Node root) {
            if (root == null) {
                return 0;
            }

            int leftCount = getCount(root.left);
            int rightCount = getCount(root.right);

            return (leftCount + rightCount) + 1;
        }

        public static int getSum(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = getSum(root.left);
            int rightSum = getSum(root.right);

            return (leftSum + rightSum) + root.data;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
        System.out.println("Preorder traversal: ");
        BinaryTree.preorder(root);
        System.out.println();

        System.out.println("Inorder traversal: ");
        BinaryTree.inorder(root);
        System.out.println();

        System.out.println("Postorder traversal: ");
        BinaryTree.postorder(root);
        System.out.println();

        System.out.println("Levelorder Traversal: ");
        BinaryTree.levelorder(root);

        System.out.println("Height of tree is: " + BinaryTree.getHieght(root));

        System.out.println("Total nodes in tree are: " + BinaryTree.getCount(root));

        System.out.println("Sum of the nodes in tree are: " + BinaryTree.getSum(root));
    }
}