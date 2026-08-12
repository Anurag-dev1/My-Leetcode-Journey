class Solution {
public:

    vector <string> result;

    void backTrack( string &curr , int n ,int open,int close ){
        if(curr.length() == 2*n){
            result.push_back(curr);
            return;
        }
        if(open < n){
            curr.push_back('(');
            backTrack(curr,n,open+1,close);
            curr.pop_back();
        }

        if(open > close){
            curr.push_back(')');
            backTrack(curr ,n , open,close+1);
            curr.pop_back();
        }
    }

    vector<string> generateParenthesis(int n) {
        string curr = "";

        int open=0,close=0;

        backTrack(curr,n,open,close);

        return result;
    }
};