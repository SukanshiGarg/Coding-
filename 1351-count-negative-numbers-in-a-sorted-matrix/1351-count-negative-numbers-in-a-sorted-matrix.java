class Solution {
    public int countNegatives(int[][] grid) {
      int count = 0;
      for(int rows[]: grid){
        int low = 0;
        int high = rows.length;
        
        while(low<high){
        int mid = (low)+ (high-low)/2;

        if(rows[mid]<0){
            high=mid;
        } 
        else{
            low=mid+1;
        }

        }
        
        count+=rows.length-low;
      }
      return count;
    }
}