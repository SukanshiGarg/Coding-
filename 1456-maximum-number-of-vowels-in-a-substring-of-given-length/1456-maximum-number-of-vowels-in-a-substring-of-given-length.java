class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int max_count=0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        max_count=count;
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return true;
        }
        return false;
    }
}