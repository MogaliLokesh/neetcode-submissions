class Solution {
    public int uniquePaths(int m, int n) {
        int [][] mem = new int[m][n];
        return helper(0, 0, m, n,mem);
    }

    private int helper(int i, int j, int m, int n, int[][]mem){
        if(i>=m ||i<0||j<0||j>=n) return 0;
        if(mem[i][j]!=0) return mem[i][j];
        // if((i=m-1 && j=n-2) || (i=m-1 && j=n-2)
        if(i==m-1&&j==n-1) return 1;
        mem[i][j] = helper(i+1,j,m,n,mem)+
                helper(i,j+1,m,n,mem);
                // helper(i-1,j,m,n,mem)+
                // helper(i,j-1,m,n,mem);

        return mem[i][j];


    }
}
