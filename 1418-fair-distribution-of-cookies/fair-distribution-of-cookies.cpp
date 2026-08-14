class Solution {
public:
    int n;

    int result = INT_MAX;

    void backTrack(int idx, vector<int>& cookies, vector<int>& children,
                   int k) {
        if (idx >= n) {
            int unfairness = *max_element(begin(children), end(children));
            result = min(result, unfairness);

            return;
        }
        int cookie = cookies[idx];
        for (int i = 0; i < k; i++) {

            children[i] += cookie;

            backTrack(idx + 1, cookies, children, k);

            children[i] -= cookie;
        }
    }

    int distributeCookies(vector<int>& cookies, int k) {
        n = cookies.size();

        vector<int> children(k, 0);

        backTrack(0, cookies, children, k);

        return result;
    }
};