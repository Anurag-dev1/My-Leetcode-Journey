class Solution {
    public int specialArray(int[] nums) {

        int n = nums.length;

        for(int x = 1; x <= n; x++) {

            int count = 0;

            for(int i : nums) {
                if(i >= x)
                    count++;
            }

            if(count == x)
                return x;
        }

        return -1;
    }
}