class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(target-nums[i])){
                arr[0]=hp.get(target-nums[i]);
                arr[1]=i;
                // list.add(hp.get(target-nums[i]));
                // list.add(i);
            }
            else{
                hp.put(nums[i],i);
            }
        }
        return arr;
    }
}