class Solution {
    class Pair{
        int min;
        int max;
        Pair(int min,int max){
            this.min=min;
            this.max=max;
        }
    }
    public int maxChunksToSorted(int[] arr) {
        Deque<Pair>st=new ArrayDeque<>();
        for(int x:arr){
            Pair curr=new Pair(x,x);
            while(!st.isEmpty() && curr.min<st.peek().max){
                Pair prev=st.pop();
                curr.min=Math.min(curr.min,prev.min);
                curr.max=Math.max(curr.max,prev.max);
            }
            st.push(curr);
        }
        return st.size();
    }
}