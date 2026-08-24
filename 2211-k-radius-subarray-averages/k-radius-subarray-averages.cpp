class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n = nums.size();

        if (k == 0)
            return nums;

        vector<int> res(n, -1);

        if (n < 2 * k + 1)
            return res;

        long long window = 0;
        int left = 0;
        int right = 2 * k;
        int i = k;

        for (int i = left; i <= right; i++) {
            window += nums[i];
        }

        int count = 2*k+1;

        res[i] = window / (count);
        i++;
        right++;

        while (right < n) {
           
            int new_to_window = nums[right];
            int out_of_window = nums[left];

            window = window + new_to_window - out_of_window;

            res[i] = window / (count);
            i++;
            right++;
            left++;
        }

        return res;
    }
};