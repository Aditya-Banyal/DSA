class Solution {
    public boolean search(int[] nums, int target) {
        int lh=0;
        int uh=nums.length-1;
        while(lh<=uh){
            int mid=(lh+uh)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[lh]==nums[mid] && nums[mid]==nums[uh]){
                lh++;
                uh--;
            }
            //left sorted
            else if(nums[lh]<=nums[mid]){
                if(nums[lh] <= target && target < nums[mid]){
                    uh=mid-1;                    
                }
                else{
                    lh=mid+1;
                }
            }
            //right sorted
            else{
                if(nums[mid]<target && target<=nums[uh]){
                    lh=mid+1;
                }
                else{
                    uh=mid-1;
                }
            }
        }
        return false;
    }
}