class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        int ps=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]+=ps;
            ps+=temp;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[arr.length-1]-arr[i]){
                return i;
            }
        }
        return -1;
    }
}
