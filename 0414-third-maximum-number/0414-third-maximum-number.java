class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int num:nums){
            if(num> largest){
                third = second;
                second = largest;
                largest = num;
            }
            else if(num > second && num !=largest){
                third = second;
                second = num;
            }
            else if(num > third && num !=second && num != largest ){
                third = num;
            }
        }
        if(third ==  Long.MIN_VALUE){
            return (int) largest;
        }
        return (int) third;
    }
}