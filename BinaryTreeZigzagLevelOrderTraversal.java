//103
//Medium

//Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

// my own solution using java:

//just reverse the odd levels and do a normal bfs level order traversal

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> ar = new ArrayList<>();
        ArrayDeque<TreeNode> ad = new ArrayDeque<>();
        if (root == null) {
            return ar;
        }
        ad.add(root);
        int cnt = 0;
        while (!ad.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = ad.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = ad.removeFirst();
                if (node != null) {
                    level.add(node.val);

                }
                if (node.left != null) {
                    ad.add(node.left);
                }
                if (node.right != null) {
                    ad.add(node.right);
                }
            }
            System.out.println(level);
            if (cnt % 2 == 0) {
                ar.add(level);
            }
            else {
                Collections.reverse(level);
                ar.add(level);
            }
            cnt++;
        }
        return ar;

        
    }
}
