class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int bitMask=0;
        int maxLength=0;
        for(int right=0;right<nums.length;right++){
            //shrinking using xor
            while( (bitMask&nums[right]) != 0){
               bitMask = bitMask ^ nums[left];
               left++;
            }
            //expand using or
            bitMask  |= nums[right];
            maxLength=Math.max(maxLength,right-left+1);

        }

        return maxLength;

    }
}