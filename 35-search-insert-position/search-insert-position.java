class Solution {
    public int searchInsert(int[] nums, int target) {
        int lh=0;
        int uh=nums.length-1;
        while(lh<=uh){
            int mid=(lh+uh)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                if(mid!=nums.length-1 && nums[mid+1]>target){
                    return mid+1;
                }
                else{
                    lh=mid+1;
                }
            }
            else if(nums[mid]>target){
                if(mid==0)return 0;
                if(nums[mid-1]<target){
                    return mid;
                }
                else{
                    uh=mid-1;
                }
            }
        }
        return nums.length;
    }
}