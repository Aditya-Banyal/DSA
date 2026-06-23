class Solution {
    public int search(int[] nums, int target) {
        int lh=0;
        int uh=nums.length-1;
        while(lh<=uh){
            int mid=(lh+uh)/2;
            if (nums[mid]==target){
                return mid;
            }
            //if left sorted
            if(nums[lh]<=nums[mid]){
                if(target>=nums[lh] && target<nums[mid]){
                    uh=mid-1;
                }
                else{
                    lh=mid+1;
                }
            }
            //right sorted
            else{
                if(target<=nums[uh] && target>nums[mid]){
                    lh=mid+1;
                }
                else{
                    uh=mid-1;
                }
            }
        }
        return -1;
    }
}