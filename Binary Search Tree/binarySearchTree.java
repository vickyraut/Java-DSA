public class binarySearchTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        }

        if (root.data > target) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    public static Node delete(Node root, int value) {
        if (root.data < value) {
            root.right = delete(root.right, value);
        } else if (root.data > value) {
            root.left = delete(root.left, value);
        } else { // voilà
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: both child
            Node inorderSuc = inorderSuccessor(root.right);
            root.data = inorderSuc.data;
            root.right = delete(root.right, inorderSuc.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int[] value = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i : value) {
            root = insert(root, i);
        }

        inorder(root);
        System.out.println();

        if (search(root, 6)) {
            System.out.println("Found...!");
        } else {
            System.out.println("Not Found...!");
        }

        printInRange(root, 5, 12);
    }
}
