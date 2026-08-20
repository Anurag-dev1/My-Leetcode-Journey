class Solution {

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;

        while(odd <=nums.length-1 && even <= nums.length-1){
            if(nums[odd] % 2 == 0 || nums[even] % 2 == 1){
                swap(nums,odd,even);
            } 
            if(nums[odd] % 2 == 1) odd+=2;
            if(nums[even] % 2 == 0) even+=2;
        }
        return nums;
    }
}