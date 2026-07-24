class Solution {
    public int maxProduct(int[] nums) {
        int sf=1;
        int pf=1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(sf==0) sf=1;
            if(pf==0) pf=1;
            pf*=nums[i];
            sf*=nums[nums.length-1-i];
            max=Math.max(Math.max(pf,sf),max);
        }
        return max;
    }
}