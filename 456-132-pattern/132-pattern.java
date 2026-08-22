class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;

        if (n < 3)
            return false;

        Stack <Integer> st = new Stack<>();

        int sec = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] < sec)
            return true;

            while (!st.isEmpty() && st.peek() < nums[i])
                sec = st.pop();

            st.push(nums[i]);
        }
        return false;
    }
}