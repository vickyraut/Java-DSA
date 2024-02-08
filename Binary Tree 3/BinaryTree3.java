import javax.management.NotificationEmitter;
import javax.print.DocFlavor;
import java.util.ArrayList;

public class BinaryTree3 {
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
        public static void kthLevel(Node root, int k, int level) {
            if (root == null) {
                return;
            }

            if (level == k) {
                System.out.println(root.data);
                return;
            }

            kthLevel(root.left, k, level + 1);
            kthLevel(root.right, k, level + 1);
        }

        public static boolean getPath(Node root, int n1, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }

            path.add(root);

            if (root.data == n1) {
                return true;
            }

            boolean foundLeft = getPath(root.left, n1, path);
            boolean foundRight = getPath(root.right, n1, path);

            if (foundLeft || foundRight) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static Node lowestCommonAncestor(Node root, int n1, int n2) {  // TC: o(n)
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            // Calculating path
            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // Finding Lowest common Ancestor
            int i = 0;

            for (; i< path1.size() && i<path2.size(); i++){
                if (path1.get(i)  != path2.get(i)){
                    break;
                }
            }

            // lac -> last equal Node
            Node lca = path1.get(i-1);
            return lca;
        }

        // Optimised with constant space Complexity
        public static Node lowestCommonAncestor2(Node root, int n1, int n2){
            if (root == null){
                return null;
            }

            if (root.data == n1 || root.data == n2){
                return root;
            }

            Node leftLca = lowestCommonAncestor2(root.left, n1, n2);
            Node rightLca = lowestCommonAncestor2(root.right, n1, n2);

            if (leftLca == null){
                return rightLca;
            }

            if (rightLca == null){
                return leftLca;
            }

            return root;
        }

        private static int lcaDist(Node root, int n) {
            if (root == null){
                return -1;
            }

            if (root.data == n){
                return 0;
            }

            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right, n);

            if (leftDist == -1 && rightDist == -1){
                return -1;
            } else if (leftDist == -1){
                return rightDist+1;
            }else {
                return leftDist+1;
            }
        }

        public static int minDist(Node root, int n1, int n2){
            Node lca = lowestCommonAncestor2(root, n1, n2);
            int dist1 = lcaDist(lca, n1);
            int dist2 = lcaDist(lca, n1);

            return dist1+dist2;
        }

        public static int kthAncestor(Node root, Node target, int k, int level){
            if (root == null){
                return -1;
            }

            if (level == k){
                return root.data;
            }

            if (root.data == target.data){
                return 0;
            }

            kthAncestor(root.left, target, k, level+1);
            kthAncestor(root.right, target, k, level+1);

            return -1;

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

        BinaryTree.kthLevel(root, 3, 2);

        System.out.println(BinaryTree.lowestCommonAncestor(root, 4, 5).data);

        System.out.println(BinaryTree.lowestCommonAncestor2(root, 4, 5).data);

        System.out.println(BinaryTree.minDist(root, 4,6));

        System.out.println(BinaryTree.kthAncestor(root, new Node(7), 2, 0));
    }
}
