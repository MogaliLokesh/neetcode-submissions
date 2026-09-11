class Solution {
    public int numIslands(char[][] grid) {
        //
        int count = 0;
        boolean [][] visited = new boolean [grid.length][grid[0].length];
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1'){ 
                count++;
                dfs(r,c,grid, visited);
                }
            }
        }

        return count;
    }

    private void dfs(int r, int c, char[][] grid, boolean [][] visited){
        if( r <0 || c<0 || r >= grid.length || c>= grid[0].length || grid[r][c] =='0' || visited[r][c]==true) return;

        visited[r][c]=true;
        grid[r][c]='0';

        dfs(r+1,c,grid, visited);
        dfs(r-1,c,grid, visited);
        dfs(r,c+1,grid, visited);
        dfs(r,c-1,grid, visited);

        visited[r][c]=false;
    }
}
