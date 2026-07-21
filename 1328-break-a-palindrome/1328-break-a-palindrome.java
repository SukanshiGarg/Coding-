class Solution {
    public String breakPalindrome(String s) {
        char[] arr= s.toCharArray();
        int n=s.length();
        boolean found=false;
        if(s.length()==1) return "";
        for(int i=0;i<s.length()/2;i++){
            if(arr[i]!='a'){
                arr[i]='a';
                found=true;
                break;
            }
        }
        if(!found) arr[arr.length-1]='b';

        String ans = new String(arr);

        return ans;

    }
}