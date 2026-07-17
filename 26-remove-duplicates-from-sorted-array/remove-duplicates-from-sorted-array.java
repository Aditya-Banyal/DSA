class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int i=0;
        int count=0;
        for(int x=1;x<nums.length;x++){
            if(nums[x]==nums[x-1]){
                count++;
            }
        }
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1]=nums[j];
                j++;
                i++;
            }
        }
        return nums.length-count;
    }
}