class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int left = 0;
        int freq[] = new int[3]; //a,b,c
        int count = 0;
        for(int right =0 ; right < s.length(); right++){
            char ch = s.charAt(right);
            freq[ch-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
               count += n-right;
               freq[s.charAt(left)-'a']--;
               left++;
            }
        }

        return count;
    }
}