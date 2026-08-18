class Solution {

    private int Possible(int[] weights, int s) {
        int n = weights.length;
        int days = 1;
        int limit = 0;
        for (int w : weights){
            if(limit + w > s ){
                days++;
                limit = 0;
            }
            limit += w;
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }

        int least = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (Possible(weights, mid) <= days) {
                least = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return least;
    }
}