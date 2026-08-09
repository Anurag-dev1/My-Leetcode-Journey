class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lp = 0, ep = 0, gp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                lp++;
            } else if (nums[i] > pivot) {
                gp++;
            } else
                ep++;
        }
        int[] res = new int[nums.length];
        int t = 0;
        int i = 0;
        int j = lp;
        int k = lp + ep;
        while (t<nums.length) {
            if(nums[t] < pivot) {
                res[i] = nums[t];
                i++;
            }else if(nums[t] == pivot) {
                res[j] = nums[t];
                j++;
            }else{
                res[k] = nums[t];
                k++;
            }
            t++;
        }
        return res;
    }
}