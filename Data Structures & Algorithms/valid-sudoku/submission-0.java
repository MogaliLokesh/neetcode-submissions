class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        //int k=3;
        Map<Integer,HashSet<Character>> rows = new HashMap<>();
        Map<Integer,HashSet<Character>> cols = new HashMap<>();
        Map<String,HashSet<Character>> box = new HashMap<>();

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                                if (board[r][c] == '.') continue;

                String str = r/3+","+c/3;
                if(rows.computeIfAbsent(r,k-> new HashSet<>()).contains(board[r][c]) ||
                cols.computeIfAbsent(c,k-> new HashSet<>()).contains(board[r][c]) ||
                box.computeIfAbsent(str,k-> new HashSet<>()).contains(board[r][c])) return false;


                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                box.get(str).add(board[r][c]);
            }
        }


        return true;
    }
}
