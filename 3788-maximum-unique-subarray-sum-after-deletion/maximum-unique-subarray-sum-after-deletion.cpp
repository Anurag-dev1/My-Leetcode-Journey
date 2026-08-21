class Solution {
public:
    int maxSum(vector<int>& nums) {

        unordered_set <int> st;
        
        int maxNeg = INT_MIN;
        int sum = 0;

        for(int &n : nums){
            if(n<=0){
                maxNeg = max(n,maxNeg);
            }else if(!st.count(n)){
                sum+=n;
                st.insert(n);
            }
        }

        sum = sum == 0 ? maxNeg:sum;

        return sum;
    }
};