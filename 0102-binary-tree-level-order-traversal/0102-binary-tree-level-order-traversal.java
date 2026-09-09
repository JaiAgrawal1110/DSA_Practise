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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue <TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list2=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode front=q.remove();
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
                list2.add(front.val);

            }
            list.add(list2);
        }
        return list;

    }
}