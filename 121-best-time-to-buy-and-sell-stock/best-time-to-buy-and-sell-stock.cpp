class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minPrices = INT_MAX;
        int maxProfit =0;
        for(int &n : prices){
            minPrices = min(minPrices , n);
            maxProfit = max(maxProfit , n - minPrices);
        }

        return maxProfit;
    }
};