class Solution {
public:
    vector<vector<int>> res;
    int n;
    void Solve(int idx , vector<int>& nums , int target , int sum ,vector<int> &temp){
        if(sum == target){
            res.push_back(temp);
            return;
        }

        if(target < sum)
        return;

        for(int i = idx ; i < n ; i++){
            if(i > idx && nums[i] == nums[i-1])
            continue;

            if(sum + nums[i] > target)
            break;

            temp.push_back(nums[i]);
            Solve(i+1 , nums , target , sum + nums[i] , temp);
            temp.pop_back();
        }
    }

    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        n = candidates.size();

        sort(candidates.begin(),candidates.end());

        vector<int> temp;
        int sum = 0;

        Solve(0 , candidates, target , sum,temp);

        return res;
    }
};