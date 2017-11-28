package Chapter04;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        value = x;
    }

    public static void printTree(TreeNode n) {

        if (n == null) return;

        System.out.println(n.value);

        printTree(n.left, 0, true);
        printTree(n.right, 0, false);
    }

    private static void printTree(TreeNode n, int level, boolean isLeft) {

        if (n == null) return;

        for (int i = 0; i < level; ++i) System.out.print("  ");

        if (isLeft)
            System.out.println("/- " + n.value);
        else
            System.out.println("\\- " + n.value);

        printTree(n.left, level + 1, true);
        printTree(n.right, level + 1, false);
    }
}
