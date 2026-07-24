class Solution {
    public int findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if (arr[index] < 0) {
                return Math.abs(arr[i]);
            }
           arr[index]*=-1;
        }
    
        return -1;
    }
}