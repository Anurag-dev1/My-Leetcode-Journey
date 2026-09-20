class Solution {
public:
    vector <vector<int>> res;
    int n ;
    void Solve(int idx , vector<int>& candidates , int sum ,vector<int> &temp,int target){
        if( sum == target ){
            res.push_back(temp);
            return;
        }

        if(sum > target)
        return ;

        for(int i = idx ; i < n ;i++){
            temp.push_back(candidates[i]);
            Solve( i , candidates , sum + candidates[i] , temp, target);
            temp.pop_back();
        }
    }

    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        n = candidates.size();
        int sum = 0;
        vector<int> temp;
        Solve(0 , candidates, sum , temp ,target);

        return res;
    }
};