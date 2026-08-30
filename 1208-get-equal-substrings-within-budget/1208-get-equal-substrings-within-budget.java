class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int max_length=0;
        int left =0;
        int cost =0;
        for(int right=0;right<s.length();right++){
            cost += Math.abs(s.charAt(right)-t.charAt(right));
            while(cost>maxCost && left<s.length()){
               cost -= Math.abs(s.charAt(left)-t.charAt(left));
               left++;
            }
            max_length=Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}