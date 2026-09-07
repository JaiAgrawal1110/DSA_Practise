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
    TreeNode prev = null;
    TreeNode head = null;

    public TreeNode increasingBST(TreeNode root) {
        help(root);
        return head;
    }

    private void help(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode right = root.right;

        help(root.left);

        if (head == null) {
            head = root;
        }

        root.left = null; 

        if (prev != null) {
            prev.right = root;
        }

        prev = root;

        help(right);
    }
}