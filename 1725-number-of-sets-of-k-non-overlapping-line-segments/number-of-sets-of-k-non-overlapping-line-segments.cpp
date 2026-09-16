class Solution {
public:
    int M = 1e9 + 7;
    int dp[1001][1001];
    int numberOfSets(int n, int k) {
        
        for(int i = 0 ; i < n ; i++){
            dp[0][i] = 1;
        }

        for(int l = 1 ; l <= k ;l++){

            vector<int> prevRowSum(n+1 , 0);
            for(int x = n-1 ; x>= 0 ;x--){
                prevRowSum[x] = (prevRowSum[x+1] +dp[l-1][x]) % M;
            }

            for(int i = n-1 ; i>= 0 ;i--){
                int take = prevRowSum[i+1];
                int skip = dp[l][i+1] % M;

                dp[l][i] = (take + skip) % M;
            }
        }
        return dp[k][0];
    }
};