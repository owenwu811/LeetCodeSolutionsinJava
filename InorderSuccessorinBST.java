//285
//Medium

//Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST. If the given node has no in-order successor in the tree, return null.

//The successor of a node p is the node with the smallest key greater than p.val.

// my own solution using java:

//just get all node values of the tree, sort them, and return a TreeNode object of the first value you find that's greater than p's value if p is not null. otherwise, return null.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void compute(TreeNode root, TreeNode p, ArrayList<Integer> ar) {
        if (root == null) {
            return;
        }
        ar.add(root.val);
        compute(root.left, p, ar);
        compute(root.right, p, ar);


    }
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        ArrayList<Integer> ar = new ArrayList<>();
        if (p == null) { return null; }
        compute(root, p, ar);
        Collections.sort(ar);
        for (Integer val: ar) {
            if (val > p.val) {
                return new TreeNode(val);
            }
        }
        System.out.println(ar);
        return null;
    }
}
