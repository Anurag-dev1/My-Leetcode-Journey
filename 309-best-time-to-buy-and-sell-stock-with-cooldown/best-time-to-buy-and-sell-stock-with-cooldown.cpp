class Solution {
public:
    int n ;
    int t[5001][2];
    int Solve(vector<int>& prices , int n , int day , bool buy){
        if(day>=n)
        return 0;
        
        int profit = 0;

        if(t[day][buy] != -1){
            return t[day][buy];
        }

        if(buy){
            int take = Solve(prices , n , day+1 , false) - prices[day];

            int not_take = Solve(prices , n , day+1 , true);

            profit = max({profit, take , not_take});
        }else{
            int sell = prices[day] + Solve(prices , n , day+2 , true);

            int not_sell = Solve(prices , n , day+1 , false);

            profit = max({profit,sell , not_sell});
        }

        return t[day][buy] = profit;
    }

    int maxProfit(vector<int>& prices) {
        n = prices.size();

        memset(t , -1, sizeof(t));

        int result = Solve(prices , n , 0 , true);
        
        return result;
    }
};