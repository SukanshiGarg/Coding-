class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // [2,2,2,3,5,5,5,8] k=3 threshold = 4
        int total = threshold*k;
        int sum = 0;
        for(int i=0;i<k;i++){
           sum+=arr[i];
        }
        int count = (sum>=total)? 1:0;

        for(int i=k;i<arr.length;i++){
           sum+=arr[i]-arr[i-k];
           count+= (sum>=total)? 1:0;
        }
        return count;
    }
}