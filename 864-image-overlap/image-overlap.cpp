class Solution {
public:

    int countOverLap(vector<vector<int>>& A, vector<vector<int>>& B , int m , int n){
        int s = A.size();
        int count = 0;
        for(int i = 0; i < s ; i++){
            for(int j = 0; j < s ; j++){

                int B_i = i + m;
                int B_j = j + n;

                if(B_i < 0 || B_j < 0 || B_i >=s || B_j >=s)
                continue;

                if(A[i][j] == 1  && B[B_i][B_j] == 1)
                count++; 
            }
        }
        return count;
    }

    int largestOverlap(vector<vector<int>>& A, vector<vector<int>>& B) {
        int n = A.size();

        int maxOverLap = 0;

        for(int rowOff = -n+1 ; rowOff < n ; rowOff++){
            for(int colOff = -n+1; colOff < n ; colOff++){
                int count = countOverLap(A , B , rowOff , colOff);

                maxOverLap = max(maxOverLap , count);
            }
        }
        return maxOverLap;
    }
};