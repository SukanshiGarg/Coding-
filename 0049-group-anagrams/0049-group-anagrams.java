class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            //we need to create a key 
            //Since String cannot be created directly
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);




        }
        return new ArrayList<>(map.values());

    }
}