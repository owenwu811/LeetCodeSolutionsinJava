//1305
//Medium

//Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.

// my own solution using java:

// just do dfs and use an arraylist and sort it

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
    public static void f(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        f(node.left, res);
        f(node.right, res);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> res = new ArrayList<>();
        f(root1, res);
        f(root2, res);
        Collections.sort(res);
        return res;
    }
}
