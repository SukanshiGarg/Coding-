class Solution {
    public int longestPalindrome(String[] words) {
        int ans=0;
        HashMap<String,Integer> map = new HashMap<>();
        //string,frequency
        for(String word : words){
            String reverse = ""+ word.charAt(1) + word.charAt(0);
            int freq = map.getOrDefault(reverse,0);
            if(freq>0){
                ans+=4;
                map.put(reverse,freq-1);
            } else{
                int currentFreq = map.getOrDefault(word, 0);
                map.put(word, currentFreq + 1);
            }

        }

        
        for (String word : map.keySet()) {

            if (word.charAt(0) == word.charAt(1)
                    && map.get(word) > 0) {

                ans += 2;
                break;
            }
        }
        return ans;
    }
}