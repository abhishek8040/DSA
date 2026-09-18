/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root==null) return new ArrayList<>();
        Map<TreeNode, TreeNode> mp = new HashMap<>();
        matchparent(root,mp);
        return bfsKthnode(target,mp,k);
    }
    private void matchparent(TreeNode root, Map<TreeNode,TreeNode> mp){
        Queue<TreeNode>q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null) {
                mp.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null) {
                mp.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
    private List<Integer> bfsKthnode(TreeNode target, Map<TreeNode,TreeNode>mp, int k){
        Queue<TreeNode>q= new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        q.offer(target);
        visited.add(target);
        int currlevel= 0; /// at target level
        while(!q.isEmpty()){
            int size = q.size();
            if(currlevel==k) break;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                // left
                if(curr.left!=null && !visited.contains(curr.left)){
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                // go right
                if(curr.right!=null && !visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                // parent -> go up
                if(mp.containsKey(curr) && !visited.contains(mp.get(curr))){
                    q.offer(mp.get(curr));
                    visited.add(mp.get(curr));
                }

            }
            currlevel++;
        }
        List<Integer> lst = new ArrayList<>();
        while(!q.isEmpty()){
            lst.add(q.poll().val);
        }
        return lst;
    }
}