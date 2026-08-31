import java.util.Arrays;

class Solution { 
    public boolean checkInclusion(String s1, String s2) { 
        int freq1[] = new int[26]; 
        int freq2[] = new int[26]; 
        int n1 = s1.length(); 
        int n2 = s2.length(); 
        
        if (n1 > n2) return false; 
        
        // Count frequencies for the initial window
        for (int i = 0; i < n1; i++) { 
            freq1[s1.charAt(i) - 'a']++; 
            freq2[s2.charAt(i) - 'a']++; 
        } 
        
        // Check if the first window matches
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }
        
        // Slide the window across s2
        for (int i = n1; i < n2; i++) { 
            freq2[s2.charAt(i) - 'a']++;       // Add new character on the right
            freq2[s2.charAt(i - n1) - 'a']--;  // Remove old character from the left
            
            if (Arrays.equals(freq1, freq2)) {  // Compare with freq1, not freq2
                return true; 
            } 
        } 
        
        return false; 
    } 
}
