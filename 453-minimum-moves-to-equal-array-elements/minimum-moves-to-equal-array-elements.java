class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        int sum = 0 ;
        int mini = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            mini = Math.min(mini , nums[i]);
        }

        return sum - n*mini;
    }
}