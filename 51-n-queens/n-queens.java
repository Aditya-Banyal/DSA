class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>list=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        int[][] mat=new int[n][n];
        fun(list,temp,0,0,n,mat);
        return list;
    }
    public boolean valid(int[][] mat,int n,int r,int c){
        if(r<n && c<n){
        //left
        for(int i=c-1;i>=0;i--){
            if(mat[r][i]==1){
                return false;
            }
        }
        //rigth
        for(int i=c+1;i<n;i++){
            if(mat[r][i]==1){
                return false;
            }
        }
        //up
        for(int i=r-1;i>=0;i--){
            if(mat[i][c]==1){
                return false;
            }
        }
        //right up
        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
                if(mat[i][j]==1){
                    return false;
                }
        }
        //left up
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(mat[i][j]==1){
                return false;
            }
        }}
        //down not possible as we are filling top to bottom
        return true;
    }
    public void fun(List<List<String>>list,List<String> temp,int r,int c,int n,int[][] mat){
       if(r==n){

    List<String> ans = new ArrayList<>();

    for(int i=0;i<n;i++){

        String s = "";

        for(int j=0;j<n;j++){

            if(mat[i][j]==1){
                s += "Q";
            }
            else{
                s += ".";
            }
        }

        ans.add(s);
    }

    list.add(ans);
    return;
}
    if(c==n)return;
        boolean ok=valid(mat,n,r,c);
        if(ok){
            mat[r][c]=1;
             fun(list, temp, r + 1, 0, n, mat);
             mat[r][c]=0;
            // temp.add("Q");
        }

        fun(list,temp,r,c+1,n,mat);
        // temp.remove(temp.size()-1);
         if(ok){
            mat[r][c]=0;
        }
    }
}