class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += Math.abs(nums[i] - nums[n/2]);
        }
        return sum ;
    }
}