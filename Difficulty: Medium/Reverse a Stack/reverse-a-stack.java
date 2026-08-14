class Solution {
    public void insertAtbottom(Stack<Integer>st,int top){
        if(st.isEmpty()){
            st.push(top);
            return;
        }
        int temp=st.pop();
        insertAtbottom(st,top);
        st.push(temp);
    }
    public void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        insertAtbottom(st,top);
    }
}
