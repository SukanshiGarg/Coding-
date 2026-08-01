class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch: word.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int val:map.values()){
            list.add(val);
        }
        Collections.sort(list, Collections.reverseOrder());
        int assign=0;
        for(int i=0;i<list.size();i++){
            assign += (i/8+1)*list.get(i);
        }

        return assign;

        
    }
}