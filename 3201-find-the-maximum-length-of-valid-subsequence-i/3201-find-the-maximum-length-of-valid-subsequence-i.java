class Solution {
    public int maximumLength(int[] nums) {
        //case 1 : Whole subsequence is either total odd/even 
        int even = 0;
        int odd = 0;
        for(int num : nums){
            if(num%2==0){
                even++;
            } else{
                odd++;
            }
        }
        //case 2:Alternating 
        int alternate=1;
        int prevParity=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            int currParity = nums[i]%2;
            if(prevParity != currParity){
                alternate++;
                prevParity = currParity;
            }
        }
        int ans = Math.max(even,Math.max(odd,alternate));
        return ans;
    }
}