class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int maxi = Integer.MIN_VALUE;
        int max_index = 0;
        int min_index = 0;
        int mini = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            if(nums[i]> maxi){
                maxi = nums[i];
                max_index = i;
            }
            if(nums[i] < mini){
                mini = nums[i];
                min_index = i;
            }
        }

        int deleteNode ;

        int left = Math.min(max_index , min_index); 
        int right = Math.max(max_index , min_index);

        int bothDelete = left + 1 +(n - right);
        int leftDelete = right +1;
        int rightDelete = n - left;

        deleteNode = Math.min(bothDelete , Math.min(leftDelete,rightDelete));

        return deleteNode;
    }
}