class Solution {
    public void solve(char[][] board) {
        Queue<int[]> q = new LinkedList<>();
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if((r==0 || c==0 || r==board.length-1 || c==board[0].length-1) && board[r][c]=='O') {
                    q.add(new int[]{r,c});
                    board[r][c]='Y';
                }
            }
        }

        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
                int[] cur = q.poll();
                int r = cur[0];
                int c = cur[1];

                int[][] directions = new int [][]{{1,0}, {0,1}, {-1,0}, {0,-1}};

                for(int[] direction : directions){
                    int nr = r+direction[0];
                    int nc = c+direction[1];

                    if(nr<0||nc<0||nr>=board.length||nc>=board[0].length||board[nr][nc]!='O') continue;
                    q.add(new int[]{nr,nc});
                    board[nr][nc]='Y';
                }
            }
        }


        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='O'){
                    board[r][c]='X';
                }
                else if (board[r][c]=='Y'){
                    board[r][c]='O';
                }
            }
        }

    }
}
