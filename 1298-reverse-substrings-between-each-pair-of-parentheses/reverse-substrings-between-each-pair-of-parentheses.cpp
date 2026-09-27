class Solution {
public:
    string reverseParentheses(string s) {
        stack<int> skip;

        string res ;

        for(char &ch: s){
            if(ch == '('){
                skip.push(res.length());
            }else if(ch == ')'){
                int l = skip.top();
                skip.pop();
                reverse(begin(res) + l , end(res));
            }else{
                res.push_back(ch);
            }
        }
        return res;
    }
};