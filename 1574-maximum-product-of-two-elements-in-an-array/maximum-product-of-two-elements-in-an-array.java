class Solution {
    public int maxProduct(int[] nums) {
        int max1=1;
        int max2=1;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max1=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max2 && i!=idx){
                max2=nums[i];
            }
        }
        max2=max2-1;
        max1=max1-1;
        return max2*max1;
    }
}