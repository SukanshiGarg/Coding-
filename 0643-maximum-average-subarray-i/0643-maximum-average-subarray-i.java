class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        
        for(int right = 0; right<nums.length ; right++){
            sum += nums[right];

            if(right-left+1 == k){
                max_sum = Math.max(sum,max_sum);
                sum-=nums[left];
                left++;
            }

        }
        return (double) max_sum/k;
    }
}