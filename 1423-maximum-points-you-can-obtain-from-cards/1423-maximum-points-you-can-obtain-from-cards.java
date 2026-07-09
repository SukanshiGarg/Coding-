class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //find minimum sum subarray of length n-k and substract it from total sum 
        //to receive the maximum points you can obtain from cards 

        //we have 4 possible conditions for 1st test case
        //1 = 3 elements from left , 3 elemets from right , 2 elements from left and one from right , 1 element from left and 2 from right

        //Because every card must come from one of the two ends.
        int n = cardPoints.length;
        int sum = 0;
         for(int i=0;i<cardPoints.length;i++){
                sum+=cardPoints[i];
        }
        if(n ==k){
           return sum;
        }
    
        //fixed window size of n-k
        int windowSize=n-k;
        int windowSum=0;
        for(int i=0;i<windowSize;i++){
          windowSum+=cardPoints[i];
        }

        //iterate over the remaining window
        int minimumSum=windowSum;
        for(int i=windowSize;i<n;i++){
            windowSum+=cardPoints[i];
            windowSum-=cardPoints[i-windowSize];

            minimumSum = Math.min(minimumSum,windowSum);
        }

        return sum-minimumSum;
       


    }
}