package Leetcode;

import java.util.*;

public class BoundaryOfBinaryTree {
    List<Integer> boundaryNodes = new ArrayList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null || root.right != null) {
            boundaryNodes.add(root.val);
        }
        TreeNode tempNode = root.left;
        while (tempNode != null) {
            if (tempNode != null && tempNode.left != null || tempNode.right != null) {
                boundaryNodes.add(tempNode.val);
            }
            if (tempNode.left != null) {
                tempNode = tempNode.left;
            } else {
                tempNode = tempNode.right;
            }
        }
        tempNode = root.right;
        getLeafNodes(root);
        Stack<Integer> stack = new Stack<>();
        while (tempNode != null) {
            if (tempNode.left != null || tempNode.right != null) {
                stack.push(tempNode.val);
            }
            if (tempNode.right != null) {
                tempNode = tempNode.right;
            } else {
                tempNode = tempNode.left;
            }
        }
        while (!stack.isEmpty()) {
            boundaryNodes.add(stack.pop());
        }
        return boundaryNodes;
    }

    private void getLeafNodes(TreeNode root) {
        if (root != null && root.left == null && root.right == null) {
            boundaryNodes.add(root.val);
        }
        if (root.left != null) {
            getLeafNodes(root.left);
        }
        if (root.right != null) {
            getLeafNodes(root.right);
        }
    }
}
