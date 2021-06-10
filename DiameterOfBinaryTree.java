package Leetcode;

public class DiameterOfBinaryTree {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return diameter-1;
    }
    private int getDiameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = getDiameter(root.left);
        int r = getDiameter(root.right);
        diameter = Math.max(diameter,l+r+1);
        return Math.max(l,r)+1;
    }
}
