class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : score){
          pq.offer(num);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(pq.poll(),i);
        }

        for(int i=0;i<score.length;i++){
            if(map.get(score[i]) ==0){
                ans[i]="Gold Medal";
            }
            else if(map.get(score[i])==1){
                ans[i]="Silver Medal";
            }
            else if(map.get(score[i])==2){
                ans[i]="Bronze Medal";
            }

            else{
                ans[i]=String.valueOf(map.get(score[i])+1);
            }
            
        }

        return ans;



    }
}