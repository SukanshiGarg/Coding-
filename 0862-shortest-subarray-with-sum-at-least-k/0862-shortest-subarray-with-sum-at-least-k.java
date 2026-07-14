class Solution {
    public int shortestSubarray(int[] nums, int k) {

        Deque<Pair<Integer, Long>> deque = new LinkedList<>();
        deque.offerLast(new Pair<>(-1, 0L));   // Initial prefix sum

        long sum = 0;
        int shortest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (!deque.isEmpty() &&
                    sum - deque.peekFirst().getValue() >= k) {

                shortest = Math.min(shortest,
                        i - deque.pollFirst().getKey());
            }

            while (!deque.isEmpty() &&
                    deque.peekLast().getValue() >= sum) {

                deque.pollLast();
            }

            deque.offerLast(new Pair<>(i, sum));
        }

        return shortest == Integer.MAX_VALUE ? -1 : shortest;
    }

    static class Pair<K, V> {
        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }
    }
}