class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1); //sum,frequency
        int sum = 0;
        int ans =0 ;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int complement = sum-k;
            if(map.containsKey(complement)){
                 ans += map.get(complement);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}