package Chapter04;

/**
 * Given a sorted (increasing order) array with unique integer
 * elements, write an algorithm to create a binary search tree
 * with minimal height.
 */

public class Q3 {

    public static TreeNode createBST(int[] a) {

        if (a == null) return null;

        return createBST(a, 0, a.length-1);
    }

    public static TreeNode createBST(int[] a, int start, int end) {

        if (start > end) return null;

        int mid = start + (end - start)/2;

        TreeNode root = new TreeNode(a[mid]);

        root.left = createBST(a, 0, mid-1);
        root.right = createBST(a, mid+1, end);

        return root;
    }

    public static void main(String[] args) {

        TreeNode.printTree(createBST(new int[] {}));
        System.out.println();

        TreeNode.printTree(createBST(new int[] {0}));
        System.out.println();

        TreeNode.printTree(createBST(new int[] {0,1}));
        System.out.println();

        TreeNode.printTree(createBST(new int[] {0,1,2,3,4}));
        System.out.println();

        TreeNode.printTree(createBST(new int[] {-1,0,1,3,4,7,9}));
        System.out.println();

    }
}
