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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        ArrayDeque<TreeNode> pq = new ArrayDeque<>();
        if(root==null)
           return list;
        TreeNode curr = null;
        pq.add(root);
        while(!pq.isEmpty()){
            ArrayList<Integer> l= new ArrayList<>();
            int size = pq.size();
            for(int i=1;i<=size;i++){
                curr = pq.poll();
                l.add(curr.val);
                if(curr.left!=null)
                   pq.add(curr.left);
                if(curr.right!=null)
                    pq.add(curr.right);

            }
            int val = Collections.max(l);
            list.add(val);
        }
        return list;
        
    }
}