class Solution {
    public int minOperations(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num :nums){
            pq.offer(num);
        }
       int count=0;

       while(!pq.isEmpty() && pq.peek()<k){
         pq.poll();
         count++;

       }

       return count;

    }
}