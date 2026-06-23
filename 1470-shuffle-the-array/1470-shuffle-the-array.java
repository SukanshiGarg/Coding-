// Using 2 pointers, one starting from 0(th) index and other from n(th) index[size/2] 
// Also using a counter pointer to check the occurrence
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        
        int[] result = new int[size];
        int i = 0, j = n;
        int counter = 0;
        while(counter < size){
            if(counter % 2 == 0){
                result[counter] = nums[i];
                i++;
            } else {
                result[counter] = nums[j++];
            }
            counter++;
        }
        return result;
    }
}