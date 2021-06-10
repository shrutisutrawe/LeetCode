package Leetcode;
import java.util.*;

public class BinaryTreeZigZagView {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagLevelNodes = new ArrayList<>();
        if(root == null){
            return zigzagLevelNodes;
        }

        int level=0;
        Stack<TreeNode> straight = new Stack<>();
        Stack<TreeNode> reverse = new Stack<>();
        straight.push(root);
        while(!straight.isEmpty() || !reverse.isEmpty()){
            if(!straight.isEmpty()){
                zigzagLevelNodes.add(new ArrayList<Integer>());
            }
            while(!straight.isEmpty()){
                TreeNode tempNode = straight.pop();
                zigzagLevelNodes.get(level).add(tempNode.val);
                if(tempNode.left != null){
                    reverse.push(tempNode.left);
                }
                if(tempNode.right != null){
                    reverse.push(tempNode.right);
                }
            }
            level++;
            if(!reverse.isEmpty()){
                zigzagLevelNodes.add(new ArrayList<>());
            }
            while(!reverse.isEmpty()){
                TreeNode tempNode = reverse.pop();
                zigzagLevelNodes.get(level).add(tempNode.val);
                if(tempNode.right != null){
                    straight.push(tempNode.right);
                }
                if(tempNode.left != null){
                    straight.push(tempNode.left);
                }
            }
            level++;
        }
        return zigzagLevelNodes;
    }
}
