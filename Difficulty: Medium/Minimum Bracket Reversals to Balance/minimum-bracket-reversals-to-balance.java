class Solution {
    public int countMinReversals(String s) {
        // code here
        Deque<Character> st=new ArrayDeque<>();
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push('}');
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.size()==0)return 0;
        if(st.size()%2!=0){
            return -1;
        }
        int size=st.size();
        while(!st.isEmpty()){
            if(st.peek()=='}'){
                close++;
            }
            st.pop();
        }
        int open=size-close;
        return (open+1)/2 + (close+1)/2;
    }
}