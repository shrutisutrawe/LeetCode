package Leetcode;

public class CountGoodNodes {
    int count = 0;

    public int goodNodes(TreeNode root) {
        int max = Integer.MIN_VALUE;
        preOrderTraversing(root, max);
        return count;
    }

    private void preOrderTraversing(TreeNode root, int max) {
        if (root != null) {
            if (root.val >= max) {
                count++;
            }
            preOrderTraversing(root.left, Math.max(root.val, max));
            preOrderTraversing(root.right, Math.max(root.val, max));
        }
    }
}
