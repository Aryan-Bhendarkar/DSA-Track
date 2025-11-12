import java.util.ArrayList;
import java.util.Stack;

public class TraversalUsingStack {
    
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

    public ArrayList<Integer> inorderTraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(current != null || stack.isEmpty()){
            
            while(current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);

            current = current.right;

        }
        return result;
    }
}
