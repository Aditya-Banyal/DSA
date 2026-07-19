class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int sf=1;
        for(int i=0;i<n;i++){
            arr[i]=1;
            arr[i]*=sf;
            sf*=nums[i];
        }
        int p=1;
        for(int i=n-1;i>=0;i--){
            int temp=nums[i];
            nums[i]=1;
            nums[i]*=p;
            p*=temp;
        }
        for(int i=0;i<n;i++){
            arr[i]*=nums[i];
        }
        return arr;
    }
}