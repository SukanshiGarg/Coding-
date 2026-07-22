class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        //sort in the ascending order
        int prev=intervals[0][1];
        int remove=0;
        for(int i=1;i<intervals.length;i++){
             if(prev>intervals[i][0]){
                //in the same range
                remove++;
                prev = Math.min(prev, intervals[i][1]);
             }else {
                // No overlap: move to the current interval
                prev = intervals[i][1];
            }
        }
        return remove;
    }
}