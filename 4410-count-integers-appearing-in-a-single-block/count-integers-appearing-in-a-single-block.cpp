class Solution {
public:
    int countSpecialIntegers(vector<int>& nums) {

        unordered_map<int, int> blocks;

        blocks[nums[0]]++;

        for (int i = 1; i < nums.size(); i++) {

            if (nums[i] != nums[i - 1]) {
                blocks[nums[i]]++;
            }
        }

        int result = 0;

        for (auto &it : blocks) {
            if (it.second == 1)
                result++;
        }

        return result;
    }
};