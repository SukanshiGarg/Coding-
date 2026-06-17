class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int rightSum=0;
        for(int i:nums){
           rightSum+=i;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            
            rightSum=rightSum-nums[i];
            
            answer[i]= Math.abs(leftSum-rightSum);

            leftSum+=nums[i];

        }

          return answer;
            
            
    }
  
}