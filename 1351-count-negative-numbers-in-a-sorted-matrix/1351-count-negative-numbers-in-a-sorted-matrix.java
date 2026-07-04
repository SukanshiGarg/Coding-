class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n=grid[0].length;
        int c=0;
        for(int i=0;i<m*n;i++){
            int row= i/n;
            int col=i%n;
            if(grid[row][col]<0){
               c++;
            }

        }
        return c;
    }
}