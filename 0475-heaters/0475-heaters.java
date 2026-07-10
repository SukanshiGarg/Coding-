class Solution {
    public int findRadius(int[] houses, int[] heaters) {
//we can dirrectly use in built binary search funcyion too
        Arrays.sort(heaters);
        int radius = 0;
        for (int house : houses) {
            int left = 0;
            int right = heaters.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (heaters[mid] < house) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            int leftDistance = Integer.MAX_VALUE;
            int rightDistance = Integer.MAX_VALUE;
            if (left < heaters.length) {
                leftDistance = heaters[left] - house;
            }
            if (right >= 0) {
                rightDistance = house - heaters[right];
            }
            int nearest = Math.min(leftDistance, rightDistance);
            radius = Math.max(radius, nearest);
        }

        return radius;
    }
}