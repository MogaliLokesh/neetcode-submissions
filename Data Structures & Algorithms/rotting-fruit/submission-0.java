class Solution {
    public int orangesRotting(int[][] grid) {

        int fresh=0;
        Queue<int[]> q = new LinkedList<>();
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==2) q.add(new int[]{r,c});
                else if (grid[r][c]==1) fresh++;
            }
        }

        if(fresh==0) return 0;
        // q.add

        int level=0;
        while(!q.isEmpty() & fresh>0){
            int len = q.size();
            for(int i=0;i<len;i++){
                int [] temp = q.poll();
                int r = temp[0];
                int c = temp[1];

                int[][] directions = new int[][] {{1,0}, {0,1}, {-1,0}, {0,-1}};

                for(int[] direction: directions){
                    int nr = r+direction[0];
                    int nc = c+direction[1];

                    if(nr<0 || nc<0 || nr>=grid.length || nc>= grid[0].length || grid[nr][nc]!=1) continue;
                    
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]=2;
                    fresh--;

                }
            }
            level+=1;
        }
        return fresh==0 ? level: -1;
    }
}
