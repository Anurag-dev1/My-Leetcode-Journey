class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int  n =nums.length;

        int currSub = nums[0];
        int maxSub = nums[0];

        for(int i =1 ;i<n ;i++){
            currSub = Math.max(nums[i],currSub+nums[i]);
            maxSub = Math.max(maxSub,currSub);
        }

        currSub = nums[0];
        int minSub = nums[0];

        for(int i =1 ;i<n ;i++){
            currSub = Math.min(nums[i],currSub+nums[i]);
            minSub = Math.min(minSub,currSub);
        }

        int max = Math.max(Math.abs(minSub),Math.abs(maxSub));

        return max;
    }
}