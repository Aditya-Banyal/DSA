/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node temp=head;
        Node h=head;
        boolean f=false;
        while(temp!=null){
            
            Node newNode=new Node(temp.val);
            if(f==false){
            h=newNode;
            f=true;}
            newNode.next=temp.next;
            temp.next=newNode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null)temp.next.random=temp.random.next;
            temp=temp.next.next;
        }
        temp=head;
        Node t=null;
        while(temp.next.next!=null){
            t=temp.next.next;
            temp.next.next=temp.next.next.next;
            temp.next=t;
            temp=t;
        }
        temp.next.next=null;
        temp.next=null;

        return h;
    }
}