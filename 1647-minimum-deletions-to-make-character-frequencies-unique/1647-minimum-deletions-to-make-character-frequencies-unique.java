class Solution {
    public int minDeletions(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());

        int count = 0;

        while (pq.size() > 1) {

            int top = pq.poll();

            if (top == pq.peek()) {
                count++;

                if (top - 1 > 0)
                    pq.offer(top - 1);
            }
        }

        return count;
    }
}