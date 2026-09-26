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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        fun(root,list,0);
        return list;
    }
    public void fun(TreeNode root,List<List<Integer>> list,int i){
        if(root==null)return;
        if(i==list.size()){
            list.add(new ArrayList());
        }
        if(i%2==0)list.get(i).add(root.val);
        else{list.get(i).add(0,root.val);}
       
            fun(root.left,list,i+1);
            fun(root.right,list,i+1);
        
        // if(i%2!=0){            
        //     fun(root.right,list,i+1);
        //     fun(root.left,list,i+1);
        // }
        return;
    }
}