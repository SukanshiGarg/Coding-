class Solution {
    public int uniqueXorTriplets(int[] nums) {
        //[1,2]
        // x^x=0 and x^0=x
        int n = nums.length;
        if(n<=2) return n;
        int ans=1;
        while(ans<=n){
            ans <<= 1;
        }
        return ans;
        
    }
}