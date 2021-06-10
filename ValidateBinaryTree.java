package Leetcode;

public class ValidateBinaryTree {
//    public boolean isValidBST(TreeNode root) {
//        Stack<TreeNode> myStack = new Stack<>();
//        Integer previous = null;
//        while(root != null || !myStack.isEmpty()){
//
//            while(root != null){
//                myStack.push(root);
//                root = root.left;
//            }
//            root = myStack.pop();
//            // System.out.println("root:"+root.val);
//            // System.out.println("prev:"+previous);
//            if(previous != null && root.val <= previous){
//                return false;
//            }
//            previous = root.val;
//            root = root.right;
//        }
//        return true;
        Integer prev;
        public boolean isValidBST(TreeNode root) {
            prev = null;
            return validateRecursion(root);
        }
        private boolean validateRecursion(TreeNode root){
            if(root == null){
                return true;
            }
            if(!validateRecursion(root.left)){
                return false;
            }
            if(prev != null && prev >= root.val){
                return false;
            }
            prev = root.val;
            return validateRecursion(root.right);
        }
}
