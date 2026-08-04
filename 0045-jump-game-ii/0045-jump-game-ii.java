class Solution {
    public int jump(int[] nums) {
        //greedy solution
        int totaljumps=0;
        int coverage=0;
        int lastIndex=0;
        int destination = nums.length-1;
        
        //base condition 
        if(nums.length == 1) return 0;
        for(int i=0;i<nums.length;i++){
            coverage = Math.max(coverage,i+nums[i]);

            if(i==lastIndex){
                lastIndex=coverage;
                totaljumps++;
            
            
            if(coverage>=destination){
                return totaljumps;
            }
        }
    }

         return totaljumps;

    }
}