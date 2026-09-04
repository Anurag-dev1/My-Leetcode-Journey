class Solution {
public:
    int n ;
    int memo[500001];
    int getIndex(vector<vector<int>> &arr , int l , int currJobEnd){
        int r = n-1;

        int mid = l + (r - l)/2;

        int result = n+1;

        while(l <= r){
            mid = l + (r - l)/2;

            if(arr[mid][0] >= currJobEnd){
                result = mid;
                r = mid - 1;
            }
            else
            l = mid + 1;
        }
        return result;
    }

    int Solve(vector<vector<int>> &arr , int i){
        if( i >= n )
        return 0;

        if(memo[i] != -1)
        return memo[i];

        int next = getIndex(arr , i+1 , arr[i][1]);
        int taken = arr[i][2] + Solve(arr, next);
        
        int notTaken = Solve(arr, i+1);

        return memo[i] = max(taken , notTaken);
    }

    int jobScheduling(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
        n = startTime.size();

        memset(memo , -1 , sizeof(memo));

        vector<vector<int>> arr(n , vector<int> (3,0));

        for(int i = 0; i< n ; i++){
            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i];
        }

        auto comp = [&](auto& vec1 ,auto& vec2){
            return vec1[0] < vec2[0];
        };

        sort(begin(arr) , end(arr) , comp);

        return Solve(arr, 0);
    }
};