class Solution {
    public void sortColors(int[] nums) {
        int i = 0 , j = 0 , k = nums.length-1;

        while(j <= k){
            if(nums[j] == 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;

                i++;
                j++;
            }else if(nums[j] == 2){
                int t = nums[k];
                nums[k] = nums[j];
                nums[j] = t;
                k--;
            }else{
                j++;
            }
        }
    }
}