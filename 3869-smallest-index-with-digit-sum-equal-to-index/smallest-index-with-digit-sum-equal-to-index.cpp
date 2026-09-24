class Solution {
public:
    int sumOfDigits(int i){
        int sum =0;
        while(i > 0){
            sum += i%10;
            i/=10;
        }
        return sum;
    }
    int smallestIndex(vector<int>& nums) {
        int mini = INT_MAX;
        int n = nums.size();

        for(int i =0 ;i < n ;i++){
            int sum = sumOfDigits(nums[i]);
            if(sum == i)
            mini = min(i , mini);
        }

        return mini == INT_MAX ? -1 : mini;
    }
};