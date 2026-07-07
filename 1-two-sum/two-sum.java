class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(mp.containsKey(k)){
                ans[0]=mp.get(k);
                ans[1]=i;
                return ans;
            }
            if(!mp.containsKey(k)){
                mp.put(nums[i],i);
            }
        }
        return ans;
    }
}