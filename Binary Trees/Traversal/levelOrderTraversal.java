import java.util.*;

public class levelOrderTraversal {
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

    public ArrayList<ArrayList<Integer>> LevelOrder(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        levelOrderTraversal traversal = new levelOrderTraversal();

        // Test with null root
        System.out.println("Testing null root:");
        try {
            ArrayList<ArrayList<Integer>> nullResult = traversal.LevelOrder(null);
            System.out.println("Result: " + nullResult);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Build sample tree:
        //     1
        //    / \
        //   2   3
        //  / \   \
        // 4   5   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        ArrayList<ArrayList<Integer>> result = traversal.LevelOrder(root);
        System.out.println("Level Order Traversal:");
        for (ArrayList<Integer> level : result) {
            System.out.println(level);
        }
    }
}
