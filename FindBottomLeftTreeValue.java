//513
//Medium

//Given the root of a binary tree, return the leftmost value in the last row of the tree.

// my own solution using java:

// do a level order bfs, and get the 1st value of the last sublist of the list of lists

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
    public int findBottomLeftValue(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        ArrayList<List<Integer>> hold = new ArrayList<>();
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.removeFirst();
                if (node != null) {
                    level.add(node.val);
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null ) {
                        q.add(node.right);
                }
                }
            }

            hold.add(level);


        }
        System.out.println(hold);
        return hold.getLast().getFirst();

        
    }
}
