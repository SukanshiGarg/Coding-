class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<n-4;i++){
            set.clear();
            for(int j=i;j<n;j++){
                char ch = word.charAt(j);
                if(ch=='a'|| ch =='e' || ch=='i'|| ch=='o' || ch=='u'){
                    set.add(ch);
                    if(set.size()==5){
                       count++;
                    }
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}