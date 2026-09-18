class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            sum = Math.max(sum,nums[i]);
            max_sum = Math.max(max_sum,sum);
            
        }

        return max_sum;
        
    }
}