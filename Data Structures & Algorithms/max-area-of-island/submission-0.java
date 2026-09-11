class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                maxArea = Math.max(maxArea, dfs(r,c,grid));
            }
        }
        
        return maxArea;
    }

    private int dfs( int r, int c, int[][] grid){
        if(r <0 || c<0 || r >= grid.length || c>= grid[0].length || grid[r][c]==0) return 0;

        grid[r][c]=0;
        int count=1;

        count+=dfs(r+1,c,grid);
        count+=dfs(r-1,c,grid);
        count+=dfs(r,c+1,grid);
        count+=dfs(r,c-1,grid);

        return count;
    }
}
