class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //Calculate the frequency of each element and store it in the map
        for(int value : nums){
            map.put(value, map.getOrDefault(value,0)+1);
        }

        //Calculate the maximum frequency
        int max_freq=0;
        for(int freq: map.values()){
            max_freq=Math.max(max_freq,freq);
        }

        //Calculate the elements whose frequency is maximum 
        int ans=0;
        for(int freq : map.values()){
            if(freq==max_freq){
                ans+=freq;
            }
        }

        return ans;

    }
}