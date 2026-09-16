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
    List<Integer> lst = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return lst;
        int level =0;
        right(root,level);
        return lst;
    }
    private void right(TreeNode root, int level){
        if(root==null) return;
        if(lst.size()==level) lst.add(root.val);
        if(root.right!=null) right(root.right,level+1);
        if(root.left!=null) right(root.left, level+1);
    }
}