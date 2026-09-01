class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int ele : nums) {
            set.add(ele);
        }

        int max_count = 0;

        for(int ele : set) {

            if(!set.contains(ele - 1)) {

                int count = 1;
                int current = ele;

                while(set.contains(current + 1)) {
                    count++;
                    current++;
                }

                max_count = Math.max(max_count, count);
            }
        }

        return max_count;
    }
}