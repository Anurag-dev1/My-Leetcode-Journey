class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int [] right = new int [n];
        int M = Integer.MAX_VALUE;
        for(int i = n-1 ; i>=0; i--){
            M = Math.min(nums[i] , M);

            right[i] = M;
        }
        int []left = new int[n];
        int MAXI = Integer.MIN_VALUE;
        for(int i = 0 ;i<n ; i++){
            MAXI = Math.max(nums[i] , MAXI);
            left[i] = MAXI;
        }

        for(int i = 0 ; i < n ; i++ ){
            int diff = left[i] - right[i];

            if(diff <= k)
            return i;
        }

        return -1;
    }
}