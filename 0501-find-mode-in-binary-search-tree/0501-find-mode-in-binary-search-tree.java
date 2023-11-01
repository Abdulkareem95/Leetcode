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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> m = new HashMap<>();
        inorder(root,m);
        int max = -1;
        int c = 0;
        for(Map.Entry<Integer,Integer> x:m.entrySet()){
            int val = x.getValue();
            
            if(val>=max){
                max = val;
                c++;
            }
           
                
        }
        
    
        ArrayList<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> x:m.entrySet()){
            int val = x.getValue();
            if(val==max){
               l.add(x.getKey());
            }
        }
        int []arr = new int [l.size()];
        int k=0;
        for(int i=0;i<l.size();i++){
            arr[k++]=l.get(i);
        }
        
   
        return arr;
        
    }
    public static void inorder(TreeNode root,HashMap<Integer,Integer> m){
        if(root!=null){
            inorder(root.left,m);
            m.put(root.val,m.getOrDefault(root.val,0)+1);
            inorder(root.right,m);
        }
    }
}