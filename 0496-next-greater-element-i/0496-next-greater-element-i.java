class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int num :nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }

        int ans[]=new int[nums1.length];
        int k=0;
        for(int num:nums1){
           ans[k++]=map.getOrDefault(num,-1);
        }

        return ans;
    }
}