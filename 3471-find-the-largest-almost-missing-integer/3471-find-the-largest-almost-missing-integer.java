class Solution {
    public int largestInteger(int[] nums, int k) {
      /*[3,9,2,1,7]  k=3 
      Basically finding in the window of size 3 how many times a particular element is coming 
      */  
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<= nums.length-k;i++){
        HashSet<Integer> set = new HashSet<>();
        for(int j=i;j<i+k;j++){
            set.add(nums[j]);
        }
        for(int ele: set){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
      }

      //now check for the largest element that has occuured only once in the array
      int ans = -1;
      for(int ele : map.keySet()){
          if(map.get(ele)==1){
            ans=Math.max(ele,ans);
          }
      }
      return ans;

    }
}