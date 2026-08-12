class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int promax=nums[n-1]*nums[n-2];

        int promin= nums[0]*nums[1];

        return (promax-promin);
    }
}