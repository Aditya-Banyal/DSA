class Solution {
    public int findMaxLength(int[] nums) {
        //first make 0's=-1 1 are +1
        //then sum nikalo prefix
        //when they repeat and of the max length thats the ans
        //mp ka -1 key =0
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