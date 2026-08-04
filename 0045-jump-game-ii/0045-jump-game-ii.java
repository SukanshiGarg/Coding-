class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            for(int j=0;j<=nums[i] && i+j<nums.length;j++){
                if(dp[i+j] != Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],1+ dp[i+j]);
                }
            }
        }
        return dp[0];
    }
}