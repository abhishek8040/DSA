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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> lst= new ArrayList<>();
        inorder(root,lst);
        return lst.get(k-1);
    }
    private void inorder(TreeNode root, ArrayList<Integer> lst){
        if(root==null) return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}