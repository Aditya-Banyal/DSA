class Node{
    HashMap<Character,Node>mp=new HashMap<>();
    boolean is_end;
    // int pre_count=0;
}
class Trie {
    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            Character ch=word.charAt(i);
            if(!curr.mp.containsKey(ch)){
                curr.mp.put(ch,new Node());
                // curr.count++;
            }
                // curr.count++;
                curr=curr.mp.get(ch);
        }
        curr.is_end=true;
        return;
    }
    
    public boolean search(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            Character ch=word.charAt(i);
            if(curr.mp.containsKey(ch)){
                curr=curr.mp.get(ch);
            }
            else{
                return false;
            }
        }
        return curr.is_end;
    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;
        // int ans=0;
        for(int i=0;i<prefix.length();i++){
            Character ch=prefix.charAt(i);
            if(curr.mp.containsKey(ch)){
                curr=curr.mp.get(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */