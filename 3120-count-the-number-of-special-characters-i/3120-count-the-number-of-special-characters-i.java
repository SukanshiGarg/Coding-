class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(char ch : word.toCharArray()){
            set.add(ch);
        }
        int count = 0;
        for(char ch : set){
            if(Character.isLowerCase(ch)){
                char up = Character.toUpperCase(ch);
                if(set.contains(up)){
                    count++;
                }
            }
        }
        return count;
    }
}