class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String words : strs){
            char ch[] = words.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(words);
        }
         return new ArrayList<>(map.values());
    }
}