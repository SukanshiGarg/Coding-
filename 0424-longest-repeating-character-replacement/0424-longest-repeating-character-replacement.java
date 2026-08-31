class Solution {
    public int characterReplacement(String s, int k) {
        int max_length = 0;
        int max_freq = 0;
        int left = 0;

        Map<Character,Integer> map = new HashMap<>();

        for(int right = 0; right < s.length() ; right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0)+1);

            max_freq = Math.max(max_freq,map.get(ch));

            int needed = (right-left+1) - max_freq;

            while(needed >k){
                char c = s.charAt(left);
                map.put(c, map.get(c)-1);

                if(map.get(c)==0){
                    map.remove(c);
                }
                 left++;
                 needed = (right-left+1) - max_freq;
            }

            max_length = Math.max(max_length, right-left+1);

            
        }

        return max_length;
    }
}