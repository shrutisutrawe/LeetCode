package Leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int depth = Integer.MAX_VALUE;
    int lsum = 0;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Pre Order Traversal
    public void preOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        Stack<TreeNode> preStack = new Stack<>();
        TreeNode tempNode = node;
        while(tempNode != null || !preStack.isEmpty()){
            while(tempNode != null){
                System.out.print(tempNode.val +",");
                preStack.push(tempNode);
                tempNode = tempNode.left;
//                System.out.println(preStack);
            }
            tempNode = preStack.pop();
            tempNode = tempNode.right;
        }
    }

    public void preOrderRecursion(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode tempNode = node;
        preRecursion(tempNode);
    }
    private void preRecursion(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val +",");
        preRecursion(node.left);
        preRecursion(node.right);
    }

    // In Order Traversal
    public void inOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        Stack<TreeNode> inStack = new Stack<>();
        while(node != null || !inStack.isEmpty()){
            while(node != null){
                inStack.push(node);
                node = node.left;
            }
            node = inStack.pop();
            System.out.print(node.val +",");
            node = node.right;
        }
    }

    public void inOrderRecursion(TreeNode node){
        inRecursion(node);
    }
    private void inRecursion(TreeNode node){
        if(node == null){
            return;
        }
        inRecursion(node.left);
        System.out.print(node.val +",");
        inRecursion(node.right);
    }

    // Post Order Traversal
    public void postOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode tempNode = node;
        TreeNode previousNode = null;
        Stack<TreeNode> postStack = new Stack<>();
        while(tempNode != null || !postStack.isEmpty()){
            while(tempNode != null){
                postStack.push(tempNode);
                tempNode = tempNode.left;
            }
            tempNode = postStack.peek();
            if(tempNode.right == null || tempNode.right == previousNode){
                System.out.print(tempNode.val +",");
                postStack.pop();
                previousNode = tempNode;
                tempNode = null;
            }else{
                tempNode = tempNode.right;
            }
        }
    }

    public void postOrderRecursion(TreeNode node){
        postRecursion(node);
    }
    private void postRecursion(TreeNode node){
        if(node == null){
            return;
        }
        postRecursion(node.left);
        postRecursion(node.right);
        System.out.print(node.val +",");
    }

    //Level Order Traversal
    public void levelOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode tempNode = node;
        q.add(tempNode);
        q.add(null);
        while(!q.isEmpty()){
            tempNode = q.remove();
            if(tempNode == null){
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(tempNode.val +",");
            if(tempNode.left != null){
                q.add(tempNode.left);
            }
            if(tempNode.right != null){
                q.add(tempNode.right);
            }
        }
    }

    public void depthFirst(TreeNode node){
        depthFirstRecursion(node);
    }
    private void depthFirstRecursion(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val +",");
        depthFirstRecursion(node.right);
        depthFirstRecursion(node.left);
    }

    //Left View
    public void leftView(TreeNode node){
        leftViewRecursion(node);
    }
    private void leftViewRecursion(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val +",");
        leftViewRecursion(node.left);
    }

    //Right View
    public void rightView(TreeNode node){
        rightViewRecursion(node);
    }
    private void rightViewRecursion(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val +",");
        rightViewRecursion(node.right);
    }

    //Size of a Tree
    public int sizeTree(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1+ subTreeSize(node.left)+ subTreeSize(node.right);
    }
    private int subTreeSize(TreeNode node){
        if(node == null){
            return 0;
        }
        int l = subTreeSize(node.left);
        int r = subTreeSize(node.right);
        return l+r+1;

    }

    //height of the tree
    public int heightTree(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(getHeight(node.left),getHeight(node.right));
    }
    private int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int l = getHeight(node.left);
        int r = getHeight(node.right);
        return 1+Math.max(l,r);
    }

    //ZigZag view


}
