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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        if(root==null) return lst;
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()) break;
                node = st.pop();
                lst.add(node.val);
                node = node.right;
            }
        }
        return lst;
    }

    // // 
    // ArrayList<Integer> lst = new ArrayList<>();
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     if(root==null) return lst;
    //     inorder(root);
    //     return lst;
    // }
    // private void inorder(TreeNode root){
    //     if(root == null) return;
    //     inorder(root.left);
    //     lst.add(root.val);
    //     inorder(root.right);
    // }
}