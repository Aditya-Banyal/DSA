class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));//increasing end sort
        if(points.length==0)return 0;
        int count=1;
        int strike=points[0][1];
        for(int i=1;i<points.length;i++){
            if(strike<points[i][0]){
                count++;
                strike=points[i][1];
            }
        }
        return count;
    }
}