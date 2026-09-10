class Solution {
    private int ROWS;
    private int COLS;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(dfs(i, j, board, word, 0)) return true;
            }
        }

        return false;
    }

    private boolean dfs(int r, int c, char[][] board, String word, int cur){
        if(cur==word.length()) return true;
        
        
        if(r<0 || c<0 || r>= ROWS || c>= COLS || board[r][c]!=word.charAt(cur) || visited[r][c]==true){
            return false;
        }

        visited[r][c]=true;
        boolean res = dfs(r+1, c, board, word, cur+1) ||
                dfs(r, c+1, board, word, cur+1) ||
                dfs(r-1, c, board, word, cur+1) ||
                dfs(r, c-1, board, word, cur+1);

        visited[r][c]=false;
        return res;
    }
}
