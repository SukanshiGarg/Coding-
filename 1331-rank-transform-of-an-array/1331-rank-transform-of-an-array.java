class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[] = arr.clone();
        Arrays.sort(copy);
        Map<Integer,Integer> map = new HashMap<>();
        int current_rank=1;
        for(int i=0;i<copy.length;i++){
           if(!map.containsKey(copy[i])){
             map.put(copy[i],current_rank);
             current_rank++;
           }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}