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
class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode node,int col,int row){
        this.node=node;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        //col row data
        //treemap : sorted hashmap
        //priority queue maintain increasing order
        Queue<Tuple>q=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> mp=new TreeMap<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple t=q.poll();
            TreeNode node=t.node;
            int col=t.col;
            int row=t.row;
            //col
            mp.putIfAbsent(col,new TreeMap<>());
            //row
            mp.get(col).putIfAbsent(row,new ArrayList<>());
            //node
            mp.get(col).get(row).add(node.val);
            //if left hai
            if(node.left!=null){
                q.offer(new Tuple (node.left,col-1,row+1));
            }
            //if right hai
            if(node.right!=null){
                q.offer(new Tuple(node.right,col+1,row+1));
            }
        }
        //map to lst2d
        for(TreeMap<Integer, List<Integer>>rows: mp.values()){
            List<Integer>list=new ArrayList<>();
            for(List<Integer>values:rows.values()){
                Collections.sort(values);
            list.addAll(values);
            }
            ans.add(list);
        }
        return ans;
    }
}