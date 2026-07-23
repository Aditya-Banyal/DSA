class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        sub(nums,0,temp,ans);
        return ans;
    }
        public void sub(int[] nums,int i,List<Integer> temp,List<List<Integer>> ans){//helper fxn
            
            if(i==nums.length){
                ans.add(new ArrayList<>(temp));
                return;//here the return will start executing from the pop line 
            }
            temp.add(nums[i]);//if i<size add to temp
            sub(nums,i+1,temp,ans);

            temp.remove(temp.size()-1);//if fully traversed all once then pop
            sub(nums,i+1,temp,ans);//after pop rerun

        }
    
}