class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int c=0;
        int l=0;
        int maxLength=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
            map.put(nums[l],map.get(nums[l])-1);
            l++;
           }
           maxLength=Math.max(maxLength,i-l+1);
        }
        return maxLength;

        

    }
}