//515
//Medium

//Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

// my own solution using java:

// just use bfs level order

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayDeque<TreeNode> d = new ArrayDeque<>();
        if (root == null) {
            return Collections.emptyList();
        }
        d.add(root);
        List<Integer> ans = new ArrayList<>();
        while (!d.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = d.size();
            for (int i = 0; i < size; i++) {
            TreeNode cur = d.removeFirst();
            if (cur != null) {
                level.add(cur.val);
                if (cur.left != null) d.add(cur.left);
                if (cur.right != null) d.add(cur.right);

            }
        }
            
            System.out.println(level);
            ans.add(Collections.max(level));
        }
        return ans;
    }
}
