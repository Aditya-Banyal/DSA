class Solution {
    public int largestRectangleArea(int[] height) {
        int[] arr=new int[height.length+1];
        Deque<Integer>st=new ArrayDeque<>();
        int[] lsmall=new int[arr.length];
        int[] rsmall=new int[arr.length];
        st.push(0);
        for(int i=0;i<height.length;i++){
            arr[i]=height[i];
        }
        arr[arr.length-1]=-1;
        lsmall[0]=-1;
        rsmall[arr.length-1]=arr.length;
        for(int i=1;i<arr.length-1;i++){
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    lsmall[i]=-1;
                }
                else{
                    lsmall[i]=st.peek();
                }
                st.push(i);
            
        }
        st.clear();
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){        
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    rsmall[i]=arr.length;
                }
                else{
                    rsmall[i]=st.peek();
                }
                st.push(i);
        }

        int area=0;
        for(int i=0;i<lsmall.length;i++){
            int width= rsmall[i]-lsmall[i]-1;
            area=Math.max(area,width*arr[i]);
        }
    return area;
    }
}