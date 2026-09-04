class Solution {
public:
    bool hasDuplicate(string &s1 ,string &s2){
        int arr[26] = {0};
        for(char ch : s1){
            if( arr[ch-'a'] > 0)
            return true;

            arr[ch-'a']++;
        }

        for(char ch : s2){
            if( arr[ch-'a'] > 0)
            return true;

            arr[ch-'a']++;
        }
        
        return false;
    }

    unordered_map<string ,int> mp;

    int Solve(vector<string>& arr , int idx , string s , int n){
        if(idx>=n)
        return s.length();
        
        int exclude = 0;
        int include = 0;

        if(mp.find(s) != mp.end())
        return mp[s];

        if(hasDuplicate(arr[idx] , s)){
            exclude = Solve(arr, idx + 1 , s, n);
        }else{
            exclude = Solve(arr, idx + 1 , s, n);

            include = Solve(arr, idx + 1 , s + arr[idx] , n);
        }

        return mp[s] =max(include, exclude);
    }
    int maxLength(vector<string>& arr) {
        int n = arr.size();

        string temp = "";

        int  i = 0;

        return Solve(arr, i ,temp,n);
    }
};