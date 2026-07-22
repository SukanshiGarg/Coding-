class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int size = 0;

        // Find the farthest destination
        for (int[] trip : trips) {
            size = Math.max(size, trip[2]);
        }

        int[] arr = new int[size + 1];

        // Difference array
        for (int[] trip : trips) {
            int p = trip[0];
            int start = trip[1];
            int end = trip[2];

            arr[start] += p;
            arr[end] -= p;
        }

        int carLoad = 0;

        // Prefix sum
        for (int i = 0; i <= size; i++) {
            carLoad += arr[i];
            if (carLoad > capacity)
                return false;
        }

        return true;
    }
}