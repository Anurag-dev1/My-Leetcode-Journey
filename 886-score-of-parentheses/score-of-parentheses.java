class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack <Integer> st = new Stack<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(0);
            }else if(ch == ')'){
                int val = st.peek();
                st.pop();

                if(val == 0){
                    val = 1;
                }
                else {
                    val = 2*val;
                }
                if(!st.isEmpty())
                st.push(st.pop() + val);
                else
                count = val + count;
            }
        }
        return count;
    }
}