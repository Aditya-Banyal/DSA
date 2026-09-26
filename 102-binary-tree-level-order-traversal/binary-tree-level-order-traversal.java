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
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>list=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty() && root!=null){
            int n=q.size();
            List<Integer>row=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.peek();
                row.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
                q.poll();
                // q.offer(peekFirst().left);
                // q.offer(peekFirst().right);
                // list.add(root.val);
                // q.removeFirst();
            }
            list.add(row);
        }
        return list;
    }
}