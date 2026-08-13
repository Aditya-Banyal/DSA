class Solution {
    //this fun is made to find largest rectangle in a histogram
    public int max_in_histogram(int[] arr){
        Deque<Integer>st=new ArrayDeque<>();
        ArrayList<Integer>list=new ArrayList<>();//this is made to copy thr main arr with +1 element -1
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]); 
        }
        list.add(-1);

        int[] lsmall=new int[list.size()-1];
        int[] rsmall=new int[list.size()-1];

        st.push(0);
        lsmall[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                lsmall[i]=-1;
            }
            else if(arr[st.peek()]<arr[i]){
                lsmall[i]=st.peek();
            }
            st.push(i);
        }

        st.clear();

        rsmall[arr.length-1]=arr.length;//we don't make it -1 as then width can be made negative
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                rsmall[i]=arr.length;
            }
            else if(arr[st.peek()]<arr[i]){
                rsmall[i]=st.peek();
            }
            st.push(i);
        }

        int area=0;
        for(int i=0;i<lsmall.length;i++){
            int width=rsmall[i]-lsmall[i]-1;
            area=Math.max(area,width*arr[i]);
        }
        return area;
    }
    public int maximalRectangle(char[][] A) {
        int r=A.length;
        int c=A[0].length;
        int[][] B=new int[r][c];
        for(int i=0;i<c;i++){
            int count=0;
            for(int j=0;j<r;j++){
                if(A[j][i]=='1'){
                    count++;
                }
                else{
                    count=0;
                }
                B[j][i]=count;
            }
        }
        int ans=0;
        for(int i=0;i<r;i++){
            ans=Math.max(ans,max_in_histogram(B[i]));
        }
        return ans;
    }
}