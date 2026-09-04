class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int[] min=arr.clone();
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(arr[i],min[i+1]);
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            if(max-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}