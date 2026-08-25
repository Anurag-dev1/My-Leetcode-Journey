class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        long long xor_all=0;
        for(int i :nums){
            xor_all ^=i;
        }
        long long mask = xor_all & -xor_all;
            int first = 0;
            int second = 0;
        for(int n:nums){
            if(n & mask){
                first ^= n;
            }else{
                second ^= n;
            }
        }
        return {first , second};
    }
};