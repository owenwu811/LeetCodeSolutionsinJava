
//199
//Medium

//Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return Collections.emptyList();
        }
        ArrayDeque<TreeNode> d = new ArrayDeque<>();
        d.add(root);
        while (!d.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = d.removeFirst();
                if (node != null) {
                    level.add(node.val);
                    if (node.left != null) d.add(node.left);
                    if (node.right != null) d.add(node.right);
                }
            }
            
            int s = level.size() - 1;
            System.out.println(level);
            if (!level.isEmpty()) ans.add(level.get(s));
        }
        return ans;
    }
}
