class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];

        for(int updates[]: bookings){
            int i=updates[0]-1;
            int j=updates[1]-1;
            int inc=updates[2];

            ans[i]+=inc;
            if(j+1<n){
                ans[j+1]-=inc;
            }
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}