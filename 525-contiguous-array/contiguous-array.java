class Solution {
    public int findMaxLength(int[] nums) {
        int ps=0;
        int max=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            ps+=nums[i];
            nums[i]=ps;
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],i);
            }
            if(mp.containsKey(nums[i]) && i-mp.get(nums[i])>max){
                max=i-mp.get(nums[i]);
            }
        }
        return max;
    }
}