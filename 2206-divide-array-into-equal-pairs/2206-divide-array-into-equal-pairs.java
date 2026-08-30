class Solution {
    public boolean divideArray(int[] arr) {
        
    int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-2;i+=2){
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
}
}