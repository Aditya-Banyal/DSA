class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pf=0;
        for(int i=0;i<n;i++){
            int temp=nums[i];
            nums[i]+=pf;
            pf+=temp;
        }
        if(nums[n-1]-nums[0]==0)return 0;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[n-1]-nums[i]){
                return i;
            }
        }
        return -1;
    }
}