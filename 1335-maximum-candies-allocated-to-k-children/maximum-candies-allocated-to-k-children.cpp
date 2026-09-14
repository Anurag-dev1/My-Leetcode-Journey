class Solution {
public:
    int maximumCandies(vector<int>& candies, long long k) {
        int low =1;
        int high = 1;
        for(int i : candies){
            high = max(high , i);
        }
        int res =0;
        
        while(low <= high){

            int mid = low + (high - low)/2;

            long long count = 0;
            for(int i : candies){
                count+= i/mid;
            }
            if(count>=k){
                res = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
};