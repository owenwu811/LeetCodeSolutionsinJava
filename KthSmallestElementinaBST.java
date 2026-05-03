//230
//Medium

//Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

// my own solution using java:

// get all nodes via dfs or bfs, sort, and return kth

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
    public static Object func(TreeNode root, ArrayList<Integer> nodes) {
        if (root == null) {
            return null;
        }
        nodes.add(root.val);
        func(root.left, nodes);
        func(root.right, nodes);
        return root;
    }
    public int kthSmallest(TreeNode root, int k) {
        System.out.println(root);
        ArrayList<Integer> nodes = new ArrayList<>();
        func(root, nodes);
        Collections.sort(nodes);
        System.out.println(nodes);
        return nodes.get(k - 1);
    }
    
}
