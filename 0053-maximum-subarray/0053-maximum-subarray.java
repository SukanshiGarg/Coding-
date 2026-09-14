class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int ele : nums){
            sum += ele;
            sum = Math.max(sum,ele);
            max_sum=Math.max(sum,max_sum);
        }
        return max_sum;
    }
}