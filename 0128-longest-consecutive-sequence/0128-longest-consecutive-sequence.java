class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max_count = 0;
        for(int ele:nums){
            set.add(ele);
        }

        for(int ele:set){
            if(!set.contains(ele-1)){
                int count=1;
                int x = ele;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                max_count= Math.max(max_count,count);
            }
        
        }

        return max_count;
        
    }
}