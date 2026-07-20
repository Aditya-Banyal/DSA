class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;//rows
        int n=grid[0].length;//cols
        int count=m*n;
        int total=m*n;
        k=k%total;
        int []arr=new int[m*n];
        int r=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            int val=grid[r][c];
            arr[(i+k)%total]=val;
            c++;
            if(c==grid[0].length){
                r++;
                c=0;
            }
        }
        r=0;
        c=0;
        int idx=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer>row=new ArrayList<>(); 
            for(int j=0;j<n;j++){
                row.add(arr[idx]);
                idx++;
            }
            list.add(row);
        }
        return list;
    }
}