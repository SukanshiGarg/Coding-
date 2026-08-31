class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int max_length =0;
        for(int right = 0 ; right<s.length(); right++){
             char ch = s.charAt(right);
             map.put(ch, map.getOrDefault(ch,0)+1);

             while(map.get(ch)>1){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);

                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
             }
             

             max_length = Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}