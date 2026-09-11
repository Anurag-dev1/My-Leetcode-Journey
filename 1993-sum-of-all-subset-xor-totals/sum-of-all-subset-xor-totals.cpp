class Solution {
public:
    int n ;
    void Solve(vector<int>& nums , int idx ,vector <int> &curr , vector <vector<int>> &subset){
        if(idx == n){
            subset.push_back(curr);
            return;
        }
        curr.push_back(nums[idx]);
        Solve(nums , idx + 1 , curr , subset);   // pick and go
        curr.pop_back();
        Solve(nums , idx + 1 , curr , subset);   // not pick and go
    }
    int subsetXORSum(vector<int>& nums) {
        n = nums.size();
        
        vector <int> curr;
        vector <vector<int>> subset;

        Solve(nums, 0 , curr , subset);

        int res = 0;

        for(vector <int> &sub :subset ){
            int Xor = 0;

            for(int &i : sub){
                Xor ^= i;
            }

            res +=Xor;
        }

        return res;
    }
};