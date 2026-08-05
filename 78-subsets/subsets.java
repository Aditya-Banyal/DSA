class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        subset(nums,temp,0,list);
        return list;
    }
    public void subset(int[] nums, ArrayList<Integer>temp,int i,List<List<Integer>> list){
        if(i==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        subset(nums,temp,i+1,list);
        temp.remove(temp.size()-1);
        subset(nums,temp,i+1,list);
    }
}