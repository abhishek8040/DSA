package Tree;

import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class boundaryTraversal {
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

        System.out.println(boundary(root));
    }
    public static ArrayList<Integer> boundary(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        if(!isLeaf(root)) res.add(root.val);
        addLeftBoundary(root,res);
        addLeaf(root,res);
        addRightBoundary(root,res);
        return res;
    }
    public static boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    public static void addLeftBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode curr = root.left;
        while(curr != null){
            if(!isLeaf(curr)) res.add(curr.val);
            if(curr.left != null) curr = curr.left;
            else{
                curr = curr.right;
            }
        }
    }
    public static void addLeaf(TreeNode root, ArrayList<Integer> res){
        if(isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if(root.left != null) addLeaf(root.left, res);
        if(root.right != null) addLeaf(root.right, res);
    }


    public static void addRightBoundary(TreeNode root, ArrayList<Integer> res){
        ArrayList<Integer> temp = new ArrayList<>();
        TreeNode curr = root.right;
        while(curr != null){
            if(!isLeaf(curr)) temp.add(curr.val);
            if(curr.right != null) curr = curr.right;
            else{
                curr = curr.left;
            }
        }
        for(int i= temp.size()-1; i>=0;i--){
            res.add(temp.get(i));
        }
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
