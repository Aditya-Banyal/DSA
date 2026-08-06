class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
    
        if(maze[0][0]==0){
            return ans;
        }
        StringBuilder temp=new StringBuilder();
        maze_fun(maze,ans,temp,0,0);
        return ans;
        
    }
    public void maze_fun(int[][] maze, ArrayList<String> ans,StringBuilder temp,int i,int j){
        //base condition 
        if(i==maze.length-1 && j==maze.length-1){
            ans.add(temp.toString());
            return;
        }
        maze[i][j] = 0;
        //if found in down
        if(i+1<maze.length && maze[i+1][j]==1){
            temp.append('D');
            maze_fun(maze,ans,temp,i+1,j);
            temp.deleteCharAt(temp.length()-1);
        }
        //left
        if(j-1>-1 && maze[i][j-1]==1){
            temp.append('L');
            maze_fun(maze,ans,temp,i,j-1);
            temp.deleteCharAt(temp.length()-1);
        }
        //if found in right
        if(j+1<maze.length && maze[i][j+1]==1){
            temp.append('R');
            maze_fun(maze,ans,temp,i,j+1);
            temp.deleteCharAt(temp.length()-1);
        }
        //up
        if(i-1>-1 && maze[i-1][j]==1){
            temp.append('U');
            maze_fun(maze,ans,temp,i-1,j);
            temp.deleteCharAt(temp.length()-1);
        }
        
maze[i][j] = 1;
    }
}