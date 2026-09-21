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
        if(nodes==null || nodes.size()==0){
            return null;
        }
        return fun(nodes,0);
    }
    public Node fun(List<Integer>nodes,int i){
        if(i>=nodes.size())return null;
        Node newNode=new Node(nodes.get(i));
 
        newNode.left=fun(nodes,2*i+1);
        newNode.right=fun(nodes,2*i+2);
        
        return newNode;
    }
}