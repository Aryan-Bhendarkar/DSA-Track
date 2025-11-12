


public class balancedTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isBalanced(TreeNode root){
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode root){
        if(root == null) return 0;
        
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);

        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }

        return 1 + Math.max(left, right);
    }

}
