class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int lh=0;
        int uh=n-1;
       
        while(lh<uh){
            int mid=(lh+uh)/2;
            //right sorted
            
                if(nums[uh]<nums[mid]){
                    lh=mid+1;
                }
                else{
                    uh=mid;
                }
        }
        return nums[lh];
    }
}