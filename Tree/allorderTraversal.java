package Tree;

import java.util.ArrayList;
import java.util.Stack;
class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val = val;
        }
    }
    class Pair{
        TreeNode node;
        int visit;
        Pair(TreeNode n, int v){
            node = n;
            visit = v;
        }
    }

public class allorderTraversal {
    
    public static void allTraversal(TreeNode root){
        if(root == null) return;
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair p = st.pop();

            // preorder
            if(p.visit ==1){
                pre.add(p.node.val);
                p.visit++;
                st.push(p);
                if(p.node.left!=null) st.push(new Pair(p.node.left,1));
            }
            // inorder
            else if(p.visit ==2){
                in.add(p.node.val);
                p.visit++;
                st.push(p);
                if(p.node.right!=null) st.push(new Pair(p.node.right,1));
            }
            // postorder
            else{
                post.add(p.node.val);
            }
        }
        System.out.println("Preorder: "+pre);
        System.out.println("Inorder: "+in);
        System.out.println("Postorder: "+post);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        allTraversal(root);
    }
}
