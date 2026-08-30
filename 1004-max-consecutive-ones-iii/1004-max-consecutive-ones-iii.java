class Solution {
    public int longestOnes(int[] nums, int k) {
        int z=0;
        int left =0;
        int maxLen=0;
        for(int right =0 ; right<nums.length;right++){
            if(nums[right]==0){
                z++;
            }
            while(z>k){
                if(nums[left]==0){
                    z--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
        
    }
}