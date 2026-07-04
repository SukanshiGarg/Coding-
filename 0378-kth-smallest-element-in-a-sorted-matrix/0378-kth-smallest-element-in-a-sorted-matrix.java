class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int m = matrix.length;
        
       
        for(int i = 0; i < m * m; i++){
            int row = i / m;
            int col = i % m;
            pq.add(matrix[row][col]);
        }
        
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans = pq.poll();
        }

        return ans;
    }
}
