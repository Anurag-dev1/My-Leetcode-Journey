class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int curr = nums[0];
        int maxSub = nums[0];

        for(int i = 1; i<n;i++){
            curr = Math.max(nums[i],curr+nums[i]);
            maxSub = Math.max(curr,maxSub);
        }
        return maxSub; 
    }
}