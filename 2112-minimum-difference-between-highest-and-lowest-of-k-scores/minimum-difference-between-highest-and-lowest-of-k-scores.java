class Solution {
    public int minimumDifference(int[] nums, int k) {

        int n = nums.length;
        int i = 0;
        int j = k - 1;
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        while(j<n){
            int curr = nums[j] - nums[i];

            min = Math.min(min , curr);
            i++;
            j++;
        }

        return min;
    }
}