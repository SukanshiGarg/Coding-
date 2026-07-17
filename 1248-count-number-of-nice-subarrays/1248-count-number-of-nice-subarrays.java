class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int odd = 0;
        int ans = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] % 2 == 1) {
                odd++;
            }

            while (odd > k) {
                if (nums[i] % 2 == 1) {
                    odd--;
                }
                i++;
            }

            ans += j - i + 1;
        }

        return ans;
    }
}