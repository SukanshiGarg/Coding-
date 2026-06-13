class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int maxc=0;
        int ans=0;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
                
            }
            if(count>maxc){
                maxc=count;
                ans=i;

            }
        }

        return new int[] {ans,maxc};
    }
}