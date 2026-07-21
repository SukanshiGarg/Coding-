
class Solution { 
    public int bagOfTokensScore(int[] tokens, int power) { 
        Arrays.sort(tokens); 
        int score = 0; 
        int i = 0; 
        int j = tokens.length - 1; 
        int max_score = 0; 
        
        // Use a while loop to control pointer convergence manually
        while (i <= j) { 
            if (tokens[i] <= power) { 
                power -= tokens[i]; 
                score++; 
                i++; // Only move the low pointer forward when we buy a token face-up
            } else if (score >= 1) { 
                power += tokens[j]; 
                score--; 
                j--; // Only move the high pointer backward when we trade for power face-down
            } else {
                // If we can't buy the smallest token and don't have score to trade, we are stuck
                break; 
            }
            max_score = Math.max(max_score, score); 
        } 
        return max_score; 
    } 
}
