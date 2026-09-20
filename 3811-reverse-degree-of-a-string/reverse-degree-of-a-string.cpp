class Solution {
public:
    int reverseDegree(string s) {
        int n = s.size();
        vector <int> freq(26);
        int sum = 0;
        for(int i= 0; i < n ; i++){
            char ch = s[i] - 'a';

            int t = 26 - ch;

            sum+= (t * (i+1));        
        }
        return sum;
    }
};