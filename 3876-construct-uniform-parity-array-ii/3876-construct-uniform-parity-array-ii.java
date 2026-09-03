class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        //find the smallest odd number 
        for(int ele : nums1){
            if( ele%2 !=0 && ele < minOdd){
                minOdd = ele;
            }
        }
        //find any number which is smaller than the min odd
        //if such number exists return false
        for(int x : nums1){
            if(x%2==0 && x<minOdd && minOdd != Integer.MAX_VALUE){
                return false;
            }
        }
        return true;
    }
}