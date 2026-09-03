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
    private boolean val(TreeNode root, int value){
        if(root==null)return true;
        if(root.val!=value)return false;
        return val(root.left,value)&& val(root.right,value);
    }
    public boolean isUnivalTree(TreeNode root) {
        return val(root,root.val);
    }
}