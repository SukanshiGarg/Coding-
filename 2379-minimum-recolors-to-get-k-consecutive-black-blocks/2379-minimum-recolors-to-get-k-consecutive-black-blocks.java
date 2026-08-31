class Solution {
    public int minimumRecolors(String s, int k) {
        int count = 0;
        int min_count=0;
        int n = s.length();
        for(int i=0;i<k;i++){
            char ch= s.charAt(i);
            if(ch == 'W'){
                count++;
            }
        }
        min_count = count;
        for(int i=k;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'W'){
                count++;
            }
            if(s.charAt(i-k)=='W'){
                count--;
            }
            min_count = Math.min(min_count,count);
        }
        return min_count;
    }
}