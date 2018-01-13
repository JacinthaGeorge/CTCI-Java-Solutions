package Chapter04;

/**
 * Implement a function to check if a binary tree is a binary search
 * tree. More precisely, the condition is that ALL left nodes must be
 * less than or equal to the current node, which must be less than ALL
 * the right nodes (for all nodes).
 */

public class Q5 {

    public static void main(String[] args) {

        // Setting up the test tree
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode r = new TreeNode(4);

        // Returns true for below tree
        n1.left = new TreeNode(1);
        n1.right = n2;
        r.left = n1;
        r.right = new TreeNode(5);

        System.out.println(isBST(r));

        // Returns false for below tree
        n1 = new TreeNode(1); n1.right = new TreeNode(3);
        r = new TreeNode(2); r.left = n1; r.right = new TreeNode(4);

        System.out.println(isBST(r));
    }

    private static boolean isBST(TreeNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.value < min || root.value > max) {
            return false;
        }

        return isBSTUtil(root.left, min, root.value-1) && isBSTUtil(root.right, root.value+1, max);
    }
}
