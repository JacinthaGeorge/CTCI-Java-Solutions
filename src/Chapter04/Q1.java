package Chapter04;

/**
 * Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined
 * to be a tree such that the heights of the two subtrees of any
 * node never differ by more than one.
 */

public class Q1 {

    public static boolean isBalanced(TreeNode r) {

        if (r == null) return true;

        int leftHeight = height(r.left);
        int rightHeight = height(r.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(r.left) && isBalanced(r.right)) {
            return true;
        }

        return false;
    }

    public static int height(TreeNode r) {

        if (r == null) {
            return 0;
        }

        return 1 + Math.max(height(r.left), height(r.right));
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(1), n2 = new TreeNode(3), r = new TreeNode(4);
        n1.left = new TreeNode(2); n1.right = n2;
        r.left = n1; r.right = new TreeNode(5);

        System.out.println(isBalanced(r) + " ");

        n2.right = new TreeNode(6);
        System.out.println(isBalanced(r) + " ");

    }
}