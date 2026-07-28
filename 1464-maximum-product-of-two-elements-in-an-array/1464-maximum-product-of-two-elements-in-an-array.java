class Solution {
    public int maxProduct(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
               
                second_largest=largest;
                 largest=nums[i];
            }

            else if(nums[i]>second_largest){
                second_largest=nums[i];
            }

        }

        return ((largest-1)*(second_largest-1));

    }
}