//113
//Medium

//Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

//A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

// my own solution using java:

// use dfs and sum each list

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
    public static void compute(TreeNode root, ArrayList<Integer> current, int targetSum, ArrayList<List<Integer>> res) {
            if (root == null) 
            {
                return;
            }
            current.add(root.val);
            compute(root.left, current, targetSum, res);
            compute(root.right, current, targetSum, res);
            int sum = 0;
            for (Integer c: current) {
                sum += c;
            }
            if (sum == targetSum && root.left == null && root.right == null) {
                System.out.println(current);
                ArrayList<Integer> cpy = new ArrayList<>();
                for (Integer c: current) {
                    cpy.add(c);
                }
                res.add(cpy);
            }
            current.removeLast();
        }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        compute(root, current, targetSum, res);
        return res;
        
        
    }
    

}
