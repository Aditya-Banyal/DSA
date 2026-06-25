class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lh=0;
        int uh=nums.length-1;
        while(lh<=uh){
            int mid=(lh+uh)/2;
            if(mid==0 || mid==nums.length-1){
                return nums[mid];
            }
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]==nums[mid-1]){
                if((mid%2)==0){
                    uh=mid-1;
                }
                else{
                    lh=mid+1;
                }
            }
            else{
                if((mid+1)%2!=0){
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