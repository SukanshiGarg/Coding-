class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(char ch: s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }
            else{
                int val = st.pop();
                int score = (val==0)? 1:2*val;
                int top=st.pop();
                st.push(top+score);
            }
        }
        return st.peek();
    }
}