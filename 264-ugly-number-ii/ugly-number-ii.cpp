class Solution {
public:
    int nthUglyNumber(int n) {
        vector <int> arr(n+1);

        int i2;
        int i3;
        int i5;

        i2 = i3 = i5 = 1;
        arr[1] = 1;
        for(int i = 2 ; i<=n ; i++){
            int i2UglyNum = arr[i2] * 2;
            int i3UglyNum = arr[i3] * 3;
            int i5UglyNum = arr[i5] * 5;

            int minUgly = min({i2UglyNum , i3UglyNum , i5UglyNum});

            if(i2UglyNum == minUgly)
            i2++;
            if(i3UglyNum == minUgly)
            i3++;
            if(i5UglyNum == minUgly)
            i5++;

            arr[i] = minUgly;
        }

        return arr[n];
    }
};