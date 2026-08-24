class Solution {
public:
    void solve(int i, int n, vector<int> &num) {
        if (i > n)
            return;

        num.push_back(i);

        for (int app = 0; app <= 9; app++) {
            int newNum = i * 10 + app;

            if (newNum > n)
                return;

            solve(newNum, n, num);
        }
    }

    vector<int> lexicalOrder(int n) {
        vector<int> num;

        for (int i = 1; i <= 9; i++) {
            solve(i, n, num);
        }

        return num;
    }
};