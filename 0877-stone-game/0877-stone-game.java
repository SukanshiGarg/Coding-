class Solution {
    int[][] dp;
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int totalSum=0;

        dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        for(int num : piles){
            totalSum+= num;
        }
        int player1=solve(piles,0,n-1);
        int player2=totalSum-player1;

        return player1 >= player2;
    }
    public int solve(int nums[], int i, int j){
        if(i>j) return 0;
        if(i==j) return nums[i];

        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        
        int takeLeft=nums[i]+Math.min(
            solve(nums,i+2,j),
            solve(nums,i+1,j-1)
        );
        int takeRight=nums[j]+Math.min(
            solve(nums,i,j-2),
            solve(nums,i+1,j-1)
        );

        return dp[i][j]=Math.max(takeLeft,takeRight);
    }
}