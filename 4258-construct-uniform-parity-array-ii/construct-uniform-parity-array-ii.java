class Solution {
    public boolean uniformArray(int[] nums1) {
        int x=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            x=Math.min(x,nums1[i]);
        }
        if(x%2==0){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]%2!=0 && (nums1[i]-x)%2!=0){
                    return false;
                }
            }
        }
        if(x%2!=0){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]%2==0 && (nums1[i]-x)%2==0){
                    return false;
                }
            }
        }
        return true;
    }
}