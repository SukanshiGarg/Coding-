class Solution {
    public int minimumPushes(String word) {
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        int assign_keys=2;
        for(int i=0;i<word.length();i++){
             if(assign_keys>9) assign_keys=2;
            map.put(assign_keys,map.getOrDefault(assign_keys,0)+1);
            sum += map.get(assign_keys);

            assign_keys++;
           
        }
        
        return sum;
    }
}