class Solution {
    public int[][] merge(int[][] intervals) {
        //sort on the basis of the starting points
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        //we use arraylist because we dont know the size of the resultant array
        ArrayList<int[]> list = new ArrayList<>();
        for(int[] interval : intervals){
            if(list.isEmpty()){
                list.add(interval);
            }
            else{
                int prev[]=list.get(list.size()-1);
                if(prev[1]>=interval[0]){
                      //means merge will happen
                      prev[1]=Math.max(prev[1],interval[1]);
                }else{
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
        
    }
}