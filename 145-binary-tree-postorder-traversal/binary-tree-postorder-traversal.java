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
            if(root.right==null || root.right==prev){//agar right se return kr rahe hai tho agar null hua tho st.top.right==null or prev stroes if that left is already done
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