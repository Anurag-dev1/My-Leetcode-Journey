class Solution {
public:
    int longestSubsequence(vector<int>& nums) {
        int n =nums.size();

        int res = 0;
        bool Zero = true;

        for(int &m:nums){
            res = res^m;

            if(m!=0){
                Zero = false;
            }
        }
        if(Zero){
            return 0;
        }
        return (res==0)?n-1:n;
    }
};