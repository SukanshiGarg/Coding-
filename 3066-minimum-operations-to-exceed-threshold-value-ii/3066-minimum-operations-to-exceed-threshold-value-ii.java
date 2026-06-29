class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long num :nums){
            pq.offer((num));
        }
        
        int operations=0;
        while(pq.peek()<k){
            long x = pq.poll();
            long y = pq.poll();

            pq.offer((Math.min(x, y) * 2 + Math.max(x, y)));

            operations++;


        }

        return operations;
       
        
    }
}