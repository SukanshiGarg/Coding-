/* given : average = 3  ie sum/k = threshold  so sum = threshold*k 
so, new condition gives us sum>=threshold *k 

apply the rules of fixed window size 

*/


class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int totalThreshold = k * threshold;
         
         int sum = 0;

         for(int i=0;i<k;i++){
            sum += arr[i];
         }

         int count = (sum >= totalThreshold)? 1:0;

         for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            count +=(sum >= totalThreshold)? 1:0;
         }

         return count;

    }
}