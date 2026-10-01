class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string res ;

        int n = word1.length();
        int m = word2.length();

        for(int i = 0 ; i < n || i < m ; i++){
            if(i < n){
                res.push_back(word1[i]);
            }
            if(i < m){
                res.push_back(word2[i]);
            }
        }

        return res;
    }
};