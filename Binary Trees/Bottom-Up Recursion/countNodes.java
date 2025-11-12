public class countNodes {
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

    public int countNode(TreeNode root){
        if (root==null) return 0;
        int left = countNode(root.left);
        int right = countNode(root.right);

        return 1 + left + right; 
    }
}
