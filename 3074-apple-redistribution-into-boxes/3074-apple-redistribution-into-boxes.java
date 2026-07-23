class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        /*Find the total number of apples */
        int total=0;
        for(int a : apple){
            total += a;
        }

        Arrays.sort(capacity);
        
        int cur=0;
        int box=0;
        for(int i=capacity.length-1;i>=0;i--){
            cur+=capacity[i];
            box++;

            if(cur >= total){
                return box;
            }
        }
        
        return box;
        
    }
}