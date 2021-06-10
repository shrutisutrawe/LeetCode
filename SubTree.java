package Leetcode;

public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null){
            return false;
        }
        if(subRoot == null){
            return true;
        }
        if(isIdentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    private boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val != subRoot.val){
            return false;
        }
        return ((root.val == subRoot.val) && isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right));
    }
}