class Solution {
public:
    string minWindow(string s, string t) {
        if(s.length() < t.length())
        return "";

        int n = s.length();

        unordered_map<char,int> mp;

        for(char &ch : t)
        mp[ch]++;

        int requiredCount = t.length();
        int i = 0,j=0;

        int windowSize = INT_MAX;
        int start = 0;

        while(j < n){
            char ch = s[j];

            if(mp[ch] > 0)
            requiredCount--;

            mp[ch]--;

            while(requiredCount == 0){
                int currWindow = j - i + 1;

                if(windowSize > currWindow){
                    windowSize = currWindow;
                    start = i;
                }

                mp[s[i]]++;

                if(mp[s[i]] > 0){
                    requiredCount++;
                }

                i++;

            }

            j++;

        }

        return windowSize == INT_MAX ? "" : s.substr(start , windowSize);
    }
};