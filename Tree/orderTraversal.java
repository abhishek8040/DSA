package Tree;
public class orderTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    // public static void inorder(Node root){
    //     if(root == null) return;
    //     inorder(root.left);
    //     System.out.print(root.val+" ");
    //     inorder(root.right); 
        
    // }
    public static void inorder(Node root){
        if(root != null) {
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right); }
        
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right); 
        
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left =c;
        a.right =d;
        Node e = new Node(6);
        b.right =e;
        System.out.print("PostOrder Traversal: ");
        postorder(root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("InOrder Traversal: ");
        inorder(root);
    }
}
