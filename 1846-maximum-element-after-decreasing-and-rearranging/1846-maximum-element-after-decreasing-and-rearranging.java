class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for(int i=1;i<arr.length;i++){
            arr[i]=Math.min(arr[i],arr[i-1]+1);
        }
        int max_element = 0;
        for(int n : arr ){
            if(n>max_element){
                max_element = n;
            }
        }
      return max_element;

    }
}