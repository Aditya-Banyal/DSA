class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        int i=0;
        int k=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return count;
    }
}