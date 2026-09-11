class Solution {
        
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==0)q.add(new int []{r,c});
            }
        }

        int level=1;

        while(!q.isEmpty()){
            int curLen = q.size();
            for(int i=0;i<curLen; i++){
                int[] coordinate = q.poll();
                int r = coordinate[0];
                int c = coordinate[1];

                int[][] directions = new int[][] {{1,0},{0,1},{-1,0},{0,-1}};

                for(int[] direction: directions){
                    int nr = r+direction[0];
                    int nc = c+direction[1];

                    if( nr<0 || nc<0 || nr>= grid.length || nc>=grid[0].length || grid[nr][nc] !=2147483647) continue;
                    grid[nr][nc]=level;
                    q.add(new int[]{nr,nc});
                }
            }
            level++;

        }
    }
}
