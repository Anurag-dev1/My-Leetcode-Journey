class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;

        int asc = 0;
        int dec = 0;

        for(int i = 0; i<n-1;i++){
            if(nums[i+1] == nums[i] ){
                asc++;
                dec++;
            }
            else if(nums[i+1] > nums[i])
            asc++;
            else
            dec++;
        }

        if(asc == n-1 || dec == n-1)
        return true;
        else 
        return false;
    }
}