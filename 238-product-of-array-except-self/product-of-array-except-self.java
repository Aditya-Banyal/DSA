class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int lp=1;
        int rp=1;

        //left prod
        for(int i=0;i<n;i++){
            arr[i]=lp;
            lp*=nums[i];
        }
        //right prod
        for(int j=n-1;j>=0;j--){
            arr[j]*=rp;
            rp*=nums[j];
        }

        return arr;
    }
}