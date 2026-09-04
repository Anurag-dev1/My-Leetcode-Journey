class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& nums) {
        int n = nums.size();

        if(n < 3)
        return 0;

        int diff2;
        int diff1;

        int count = 0;

        int total = 0;

        for(int i = 1 ; i < n-1 ; i++){
            diff1 = nums[i] - nums[i-1];
            diff2 = nums[i+1] - nums[i];

            if(diff1 == diff2)
            count++;
            else 
            count = 0;
            
            total = total + count;
        }

        return total;
    }
};