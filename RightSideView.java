package Leetcode;

import java.util.*;
//import Leetcode.TreeNode;

public class RightSideView {
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        int level =0;
        rightViewRecursion(root,level);
        return result;
    }
    private void rightViewRecursion(TreeNode node, int level){
        if(level == result.size()){
            result.add(node.val);
        }
        if(node.right != null){
            rightViewRecursion(node.right,level+1);
        }
        if(node.left != null){
            rightViewRecursion(node.left,level+1);
        }
    }
}
