class Solution {
public:
    int calculate(string s) {
        int n = s.length();
        stack <int> st;

        long num = 0;
        long result = 0;
        int sign = 1;

        for(int i = 0 ; i < n ;i++){
            if(isdigit(s[i]))
                num = (num *10) + (s[i] - '0');
            else if(s[i] == '+'){
                result +=(num*sign);
                num =0;
                sign = 1;
            }
            else if(s[i] == '-'){
                result +=(num*sign);
                num = 0;
                sign = -1;
            }
            else if(s[i] == '('){
                st.push(result);
                st.push(sign);

                result = 0;
                sign = 1;
            }
            else if(s[i] == ')'){
                result += (num*sign);
                num = 0;

                int last_sign = st.top();   st.pop();
                int last_num = st.top();    st.pop();

                result *= last_sign;
                result += last_num;
            }
        }
        result += (num * sign);
        return result;
    }
};