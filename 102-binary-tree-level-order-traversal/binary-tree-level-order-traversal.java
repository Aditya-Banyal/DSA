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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        traverse(root,ans,0);
        return ans;
    }
    public void traverse(TreeNode curr,List<List<Integer>> ans,int i){
        if(curr==null)return;
        if(ans.size()<=i){
            ans.add(new ArrayList<>());
        }
        ans.get(i).add(curr.val);
        traverse(curr.left,ans,i+1);
        traverse(curr.right,ans,i+1);
       
    }
}