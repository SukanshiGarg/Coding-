class Solution {
    public int minDeletion(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i += 2) { // the second condition given
            if (nums[i] == nums[i + 1]) {
                counter++;
                i--;
            }
        }
		return (nums.length - counter) % 2 == 1?++counter: counter; //checking if the array is even
    }
}