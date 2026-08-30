class Solution {
    public boolean divideArray(int[] nums) {
        //hash set approach 
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(!set.add(x)){
                set.remove(x);
            }
        }
        return set.isEmpty();
    }
}