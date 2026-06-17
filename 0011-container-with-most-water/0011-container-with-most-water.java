class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0;
        int j=n-1;
        int h,width;
        int maxArea=Integer.MIN_VALUE;
        while(i<=j){
            h=Math.min(height[i],height[j]);
            width=j-i;
            int curArea=h*width;
            maxArea=Math.max(curArea,maxArea);

            if(height[i]<height[j]) i++;
            else j--;
        }
        
        return maxArea;

    }
}