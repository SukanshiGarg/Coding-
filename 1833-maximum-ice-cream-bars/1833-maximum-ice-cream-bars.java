class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max_cost = 0;
        for(int cost : costs){
            if(cost>max_cost){
                max_cost=cost;
            }
        }
        int freq[] = new int[max_cost+1]; 
        //given: 1 <= costs[i] <= 105

        for(int cost: costs){
            freq[cost]++;
        }
        int count=0;
        for(int cost=1; cost<=max_cost;cost++){
            if(freq[cost]>0){
                int buy=Math.min(freq[cost], coins/cost);
                count+=buy;
                coins-=(buy*cost);
            }

            if(coins == 0) break;
        }
        return count;
    }
}