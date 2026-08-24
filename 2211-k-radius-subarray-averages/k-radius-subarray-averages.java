class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;

        if (k == 0)
            return nums;

        int[] res = new int[n];

        Arrays.fill(res, -1);

        if (n < 2 * k + 1)
            return res;

        long window = 0;
        int left = 0;
        int right = 2 * k;
        int i = k;

        for (int j = left; j <=right; j++) {
            window +=nums[j];
        }

        int count = 2*k+1; 
        res[i] = (int)(window/count);

        i++;
        right++;

        while(right < n){
            int next = nums[right];
            int back = nums[left];

            window = window - back + next;

            res[i] =(int) (window/count);

            left++;
            i++;
            right++;
        }

        return res;
    }
}