class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int sf=1;
        int pf=1;
        for(int i=0;i<nums.length;i++){
            if(sf==0) sf=1;
            if(pf==0) pf=1;

            pf*=nums[i];
            sf*=nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(pf,sf));
        }
        return ans;
    }
}