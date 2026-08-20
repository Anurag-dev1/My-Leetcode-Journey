class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int currMin = nums[0];
        int currMax = nums[0];
        int minSub = nums[0];
        int maxSub = nums[0];
        int sum =nums[0];

        for (int i = 1; i < n ; i++) {
            sum +=nums[i];

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSub = Math.min(currMin, minSub);

            currMax = Math.max(nums[i],currMax + nums[i]);
            maxSub = Math.max(maxSub,currMax);
        }
        if(maxSub>0)
        maxSub = Math.max(maxSub,sum - minSub);
        return maxSub;
    }
}