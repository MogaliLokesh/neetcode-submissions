class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int l=0, r=rows*cols;

        while(l<r){
            int m = l+(r-l)/2;

            //get coordinates from m;
            int i = m/cols;
            int j = m%cols;

            if(matrix[i][j]>=target){
                r=m;
            }
            else{
                l=m+1;
            }
        }

        

        return l<cols*rows && matrix[l/cols][l%cols] == target ? true : false;
    }
}
