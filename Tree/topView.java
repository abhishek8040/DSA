// package Tree;

import java.util.*;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Pair{
    TreeNode node;
    int col;
    Pair(TreeNode node, int col){
        this.node = node;
        this.col = col;
    }
}

public class topView {
     public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(12);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(11);

        System.out.println(printTopView(root));
    }
    public static ArrayList<Integer> printTopView(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode curr = p.node;
            int col = p.col;
            if(!mp.containsKey(col)){
                mp.put(col,curr.val);
            }
            if(curr.left!=null) q.add(new Pair(curr.left, col-1));
            if(curr.right!=null) q.add(new Pair(curr.right, col+1));
        }

        for(int val:mp.values()){
            ans.add(val);
        }
        return ans;
        
    }
    
    // ////        1
    //          /     \
    //         2       3
    //       /   \    /  \
    //      4     5  10   9
    //     /     / \  /    \
    //    6     7   8 12    11
    //      
}
