class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Deque<Integer> st=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(-1);
        }
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                list.set(st.pop(),arr[i]);
            }
            st.push(i);
        }
        return list;
    }
}