class Solution {
    public long countCommas(long n) {
        //now the constraint is 10^15
        // we kknow after every 3 commas 
        long ans=0;
        for(long i=1000;i<=n; i*=1000){
            ans+=n-i+1;
        }
        return ans;
    }

}