

public class diameterOfTree {
    
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

    int diameter = 0;

    public int calculateDiameter(TreeNode root){
        height(root);
        return diameter;
    }

    private int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        diameter =  Math.max(diameter, left+right);
        return 1+Math.max(left, right);
    }
}
