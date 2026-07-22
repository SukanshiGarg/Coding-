class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        //sorted on the basis of then end points 
        int start_pos=points[0][1];
        int arrows=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>start_pos){
                arrows++;
                start_pos=points[i][1];
            }
            
        }
        return arrows;
    }
}