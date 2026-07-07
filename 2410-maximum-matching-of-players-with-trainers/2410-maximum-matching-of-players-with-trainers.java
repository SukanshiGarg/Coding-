class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int n = players.length;
        int m = trainers.length;

        int l = 0; // player
        int r = 0; // trainer

        while (l < n && r < m) {
            if (players[l] <= trainers[r]) {
                l++; // match found
            }
            r++; // move to next trainer
        }

        return l;
    }
}