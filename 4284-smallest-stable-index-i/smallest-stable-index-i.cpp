class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int n = nums.size();
        int left = INT_MIN;
        vector <int> right(n);
        int M = INT_MAX;
        for(int i = n-1 ; i >= 0; i--){
            M = min(nums[i],M);
            right[i] = M;
        }

        for(int i = 0 ; i< n ; i++){
            left = max(left , nums[i]);

            if(left - right[i] <= k)
            return i;
        }

        return -1;
    }
};