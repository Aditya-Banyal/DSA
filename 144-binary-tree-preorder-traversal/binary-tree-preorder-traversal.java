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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode temp=root;
        Deque<TreeNode> st=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null || !st.isEmpty()){
            while(temp!=null){
                list.add(temp.val);
                st.push(temp);
                temp=temp.left;
            }
            temp=st.pop();
            temp=temp.right;
        }
        return list;
    }
}