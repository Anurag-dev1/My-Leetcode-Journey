class Solution {
    public long maxValue(int[] nums) {
        int n = nums.length;
        long[] P = new long[n + 1];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                P[i + 1] = P[i] + nums[i];
            else
                P[i + 1] = P[i] - nums[i];
        }
        long original_sum = P[n];
        long max_gain = 0;

        long MIN_VAL = (long) -1e17;
        long max_P_lp1_even = MIN_VAL;
        long max_P_lp1_odd = MIN_VAL;
        long max_P_l_even = MIN_VAL;
        long max_P_l_odd = MIN_VAL;

        for (int r = 1; r < n; r++) {
            int l = r - 1;

            if (l % 2 == 0) {
                max_P_lp1_even = Math.max(max_P_lp1_even, P[l + 1]);
                max_P_l_even = Math.max(max_P_l_even, P[l]);
            } else {
                max_P_lp1_odd = Math.max(max_P_lp1_odd, P[l + 1]);
                max_P_l_odd = Math.max(max_P_l_odd, P[l]);
            }

            long curr_max = MIN_VAL;

            if (r % 2 == 0)
                curr_max = Math.max(max_P_lp1_even, max_P_l_odd);

            else
                curr_max = Math.max(max_P_lp1_odd, max_P_l_even);

            if (curr_max != MIN_VAL) {
                long gain = 2L * (curr_max - P[r + 1]);
                max_gain = Math.max(max_gain, gain);
            }
        }
        return original_sum + max_gain;
    }
}