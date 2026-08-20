class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0, high = nums.length-1;

        while (low <= high) {
            if (nums[low] % 2 == 1) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                high--;
            }else{
                low++;
            }
        }
        return nums;
    }
}