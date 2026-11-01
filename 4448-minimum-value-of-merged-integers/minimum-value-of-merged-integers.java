class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;

        for(int i = 0 ; i < n-1 ; i+=2){
            String sum = "";
            sum = sum + nums[i];
            sum = sum + nums[i+1];
            int val = Integer.parseInt(sum);

            mini = Math.min(val , mini);
        }
        return mini;
    }
}