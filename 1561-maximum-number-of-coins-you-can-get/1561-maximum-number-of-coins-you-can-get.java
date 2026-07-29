class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l =0;
        int r=piles.length-1;
        int ans=0;
        while(l<r){
            //alice
            r--;

            //you
            ans+=piles[r];
            r--;

            //bob
            l++;

        }
        return ans;
    }
}