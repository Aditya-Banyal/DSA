class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        int ps=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]+=ps;
            ps+=temp;
        }
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int sum;
            if(l==0){
                sum=arr[r];
            }
            else{
                sum=arr[r]-arr[l-1];
            }
            list.add(sum/(r-l+1));
        }
        return list;
    }
}