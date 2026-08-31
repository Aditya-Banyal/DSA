/*
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public Node buildTree(List<Integer> nodes) {
        // code here
        if(nodes==null || nodes.size()==0){
            return null;
        }
        return buildTree(nodes,0);
        
    }
    public Node buildTree(List<Integer> nodes,int i){
        if(i>=nodes.size()){
            return null;
        } 
        Node root=new Node(nodes.get(i));
        root.left=buildTree(nodes,2*i+1);
        root.right=buildTree(nodes,2*i+2);
        return root;
    }
}