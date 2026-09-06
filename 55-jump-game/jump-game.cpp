class Solution {
public:
    int n;
    int t[10001];
    bool Solve(vector<int> &nums , int idx){
        if(idx == n-1)
        return true;

        if(t[idx] != -1)
        return t[idx];

        for(int i= 1 ; i<= nums[idx] && idx + i < n; i++){
            if(Solve(nums, idx+i) == true)
            return t[idx] = true;
        }
        return t[idx] = false;
    }
    bool canJump(vector<int>& nums) {
        n = nums.size();

        memset(t,-1,sizeof(t));

        bool res =Solve(nums, 0);
        
        return res;
    }
};