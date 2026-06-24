class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int lsum=0;
        int rsum=0;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            currsum=nums[i];
            rsum=total-(currsum+lsum);
            if(lsum==rsum)return i;
            lsum+=nums[i];

        }
        return -1;
    }
}