class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max_freq=0;
        int max_length=0;
        int freq[]= new int[26];

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch-'A']++;
            max_freq=Math.max(max_freq, freq[ch-'A']);

            while((right-left+1)-max_freq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max_length=Math.max(max_length,right-left+1);
        }

        return max_length;
    }
}