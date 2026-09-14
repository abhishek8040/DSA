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
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer>lst = new ArrayList<>();
        if(root==null) return lst;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        TreeNode node = root;
        st1.push(node);
        while(!st1.isEmpty()){
            node = st1.pop();
            st2.push(node);
            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);
        }
        while(!st2.isEmpty()){
            lst.add(st2.pop().val);
        }
        return lst;
    }



    // ArrayList<Integer> arr = new ArrayList<>();
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     postorder(root);
    //     return arr;
    // }
    // public void postorder(TreeNode root){
    //     if(root == null) return;
    //     postorder(root.left);
    //     postorder(root.right);
    //     arr.add(root.val);
    // }
}