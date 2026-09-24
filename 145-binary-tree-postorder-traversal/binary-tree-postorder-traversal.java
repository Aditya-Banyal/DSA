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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        TreeNode prev=null;
        if(root==null)return list;
        Deque<TreeNode>st=new ArrayDeque<>();
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            root=st.peek();
            if(root.right==null || root.right==prev){
                list.add(root.val);
                st.pop();
                prev=root;
                root=null;
            }
            else{
            root=root.right;
            }
            
        }
        return list;
    }
}