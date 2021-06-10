package Leetcode;

import java.util.Arrays;
import java.util.List;

public class TreeMain {
    public static void main(String args[]) {
//        BinaryTree node12 = new BinaryTree(12,null,null);
        TreeNode node11 = new TreeNode(11, null, null);
        TreeNode node10 = new TreeNode(10, null, null);
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node7 = new TreeNode(7, null, node11);
        TreeNode node6 = new TreeNode(6, node10, null);
        TreeNode node5 = new TreeNode(5, null, node9);
        TreeNode node4 = new TreeNode(4, node8, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode node1 = new TreeNode(1, node2, node3);
//        System.out.println(node1.heightTree(node1));
        RightSideView rightSide = new RightSideView();
        List<Integer> result = rightSide.rightSideView(node1);
        System.out.println(Arrays.toString(result.toArray()));
//        System.out.println(node1.sizeTree(node1));
//        node1.preOrderTraversal(node1);
//        System.out.println();
//        node1.preOrderRecursion(node1);
//        System.out.println("\nIn Order:");
//        node1.inOrderTraversal(node1);
//        System.out.println();
//        node1.inOrderRecursion(node1);
//        System.out.println("\nPost Order:");
//        node1.postOrderTraversal(node1);
//        System.out.println();
//        node1.postOrderRecursion(node1);
//        node1.levelOrderTraversal(node1);
//        node1.depthFirst(node1);
//        node1.leftView(node1);
//        node1.rightView(node1);
//        node1.inOrder(node1);
//        node1.postOrderRecursion(node1);
//           node1.levelOrder(node1);
        // node1.depthFirst(node1);
//        node1.rightView(node1);
//        List<List<Integer>> zigzagLevelNodes = node1.zigzagView(node1);
//        System.out.println(zigzagLevelNodes.toString());
        //node1.sizeofTree(node8);
        //node1.heightofTree(node1);
        //node1.leafNodes(node1);
        //node1.sumOfLeftLeaves(node1);
        //node1.miniDepth(node1);
        //node1.heightofTree(node1);
        //node1.balanceTree(node1);
//        node1.miniDepth(node1);
//        node1.sumLLeaves(node1);
//        node1.sumOfLeftLeaves(node1);
    }
}
