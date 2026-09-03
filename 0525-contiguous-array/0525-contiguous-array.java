class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefixSum = 0;
        int max_length =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
               prefixSum -= 1;
            }
            else{
                prefixSum += 1;
            }

            if(map.containsKey(prefixSum)){
                int length = i-map.get(prefixSum);
                max_length = Math.max(max_length,length);
            }
            else{
                //we want to store only the first indices
                map.put(prefixSum,i);
            }
        }
        return max_length;
    }
}