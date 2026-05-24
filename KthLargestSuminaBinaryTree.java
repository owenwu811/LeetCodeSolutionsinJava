//2583
//Medium

//You are given the root of a binary tree and a positive integer k.

//The level sum in the tree is the sum of the values of the nodes that are on the same level.

//Return the kth largest level sum in the tree (not necessarily distinct). If there are fewer than k levels in the tree, return -1.

//Note that two nodes are on the same level if they have the same distance from the root.

// my own solution using java:

// add up all the nodes with values for each level using bfs, and return a long

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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> level_sums = new ArrayList<>();
        ArrayDeque<TreeNode> d = new ArrayDeque<>(); 
        d.add(root);
        while (!d.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            long ls = 0;
            long size = d.size();
            for (int i = 0; i < size; i++) 
            {
                TreeNode cur = d.pop();
                if (cur != null) {
                    level.add(cur.val);
                    ls += cur.val;
                    if (cur.left != null) {
                        d.add(cur.left);
                    }
                    if (cur.right != null) {
                        d.add(cur.right);
                    }
                }
    

        }
        //System.out.println(level);
        level_sums.add(ls);

        }
        Collections.sort(level_sums);
        int diff = level_sums.size() - k;
        if (level_sums.size() < k) {
            return -1;
        }
        try {
            return (long) level_sums.get(diff);
        }
        catch (Exception e) {
            return -1;
        }

    }
}
