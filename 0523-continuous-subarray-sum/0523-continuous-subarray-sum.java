class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 0);
        int[] prefixSum= new int[n+1];
        prefixSum[0]=0;
        
        for(int i=0;i<nums.length;i++){
            prefixSum[i+1]=(prefixSum[i]+nums[i])%k;
            if(!map.containsKey(prefixSum[i+1])){
                map.put(prefixSum[i+1],i+1);
            }
            else{
                if((i+1)-map.get(prefixSum[i+1]) >=2 ){
                    return true;
                }
            }
        }
        return false;
    }
}