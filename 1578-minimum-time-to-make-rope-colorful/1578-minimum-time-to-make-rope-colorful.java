class Solution {
    public int minCost(String s, int[] neededTime) {
        int ans = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                ans += Math.min(neededTime[i],neededTime[i-1]);
                // Keep the expensive one
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return ans;
    }
}