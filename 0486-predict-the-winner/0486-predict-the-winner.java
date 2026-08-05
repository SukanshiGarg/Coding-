class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int player1 = solve(nums, 0, n - 1);
        int player2 = totalSum - player1;
        
        return player1 >= player2;
    }
    
    public static int solve(int nums[], int i, int j) {
        // Fix 1: If pointers cross, no elements are left
        if (i > j) return 0; 
        // Base case: Only 1 element left
        if (i == j) return nums[i]; 
        
        
        int takeLeft = nums[i] + Math.min(solve(nums, i + 2, j), solve(nums, i + 1, j - 1));
        int takeRight = nums[j] + Math.min(solve(nums, i, j - 2), solve(nums, i + 1, j - 1));
        
        return Math.max(takeLeft, takeRight);
    }
}
