
class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if (value == 1) return -1;

        int p = value;

        for (int i = 2; i <= value / i; i++) {
            if (value % i == 0) {
                p = i;
                break;
            }
        }

        if ((long) value - p < 2L * index) {
            return -1;
        }

        int t = n - index - 1;

        if (t == 0) {
            return value;
        }

        return (long) value + p + 2L * (t - 1);
    }
}
