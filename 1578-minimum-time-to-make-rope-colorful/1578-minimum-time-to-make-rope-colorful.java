class Solution {
    public int minCost(String s, int[] neededTime) {
        int n=s.length();
        int i=0;
        int time=0;
        for(int j=1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                time+=Math.min(neededTime[i],neededTime[j]);

                if(neededTime[j]>neededTime[i]){
                    i=j;
                }
            }
            else{
                i=j;
            }
        }
        return time;
    }
}