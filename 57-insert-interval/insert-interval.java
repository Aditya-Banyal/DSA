class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {
        ArrayList<int[]>list=new ArrayList<>();
        boolean inserted=false;
        for(int i=0;i<intervals.length;i++){
            //inserting before
            if(intervals[i][1]<newinterval[0]){
                list.add(intervals[i]);
            }
            //inserting after new
            else if(intervals[i][0]>newinterval[1]){
                if(!inserted){
                    list.add(newinterval);
                    inserted=true;
                }
                list.add(intervals[i]);
            }
            //if intervals found
            else{
                newinterval[0]=Math.min(intervals[i][0],newinterval[0]);
                newinterval[1]=Math.max(intervals[i][1],newinterval[1]);
            }

        }
         if (!inserted) {
            list.add(newinterval);
        }
        return list.toArray(new int[list.size()][]);
    }
}