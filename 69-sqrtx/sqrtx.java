class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x<=3)return 1;
        int ans=0;
        int lh=2;
        int uh=x/2;
        while(lh<=uh){
            long mid=(lh+uh)/2;
            if((mid*mid)>x){
                uh=(int)mid-1;
            }
            else if((mid*mid)<x){
                ans=(int)mid;
                lh=(int)mid+1;
            }else{
                return (int)mid;
            }
        }
        return ans;
    }
}