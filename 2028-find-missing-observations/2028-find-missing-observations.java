class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int ans[] = new int[n];
        int m = rolls.length;
        int total=(n+m)*mean;
        int sum=0;
        for(int i=0;i<m;i++){
          sum+=rolls[i];
        }
        int remaining=total-sum;
        if(remaining<n || remaining>6*n) return new int[0];

        Arrays.fill(ans,1);
        remaining-=n;

        // Distribute the remaining sum
        for (int i = 0; i < n && remaining > 0; i++) {
            int add = Math.min(5, remaining);
            ans[i] += add;
            remaining-= add;
        }

        return ans;

    }
}